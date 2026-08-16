package com.example.orderservice;

import com.example.inventoryservice.grpc.DeductStockRequest;
import com.example.inventoryservice.grpc.DeductStockResponse;
import com.example.inventoryservice.grpc.InventoryServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    // 1. 注入 gRPC Client
    @GrpcClient("inventory-service")
    private InventoryServiceGrpc.InventoryServiceBlockingStub inventoryStub;

    // 2. 注入 Spring 提供發送 Kafka 訊息的工具 Template
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    // 定義要發送的 Kafka Topic 名稱
    private static final String TOPIC = "order-events";

    @PostMapping("/create")
    public Map<String, Object> createOrder(@RequestParam String productId, @RequestParam int amount) {
        Map<String, Object> result = new HashMap<>();

        try {
            // 步驟 A: 組裝 gRPC 請求
            DeductStockRequest request = DeductStockRequest.newBuilder()
                    .setProductId(productId)
                    .setAmount(amount)
                    .build();

            // 步驟 B: 呼叫 inventory-service 扣減庫存
            DeductStockResponse response = inventoryStub.deductStock(request);

            result.put("success", response.getSuccess());
            result.put("message", response.getMessage());
            result.put("remainingQuantity", response.getRemainingQuantity());
            result.put("orderedProductId", productId);
            result.put("orderedAmount", amount);

            // 步驟 C: 如果庫存扣減成功，發送 Kafka 訊息通知 notification-service
            if (response.getSuccess()) {
                String notificationMessage = String.format("訂單建立成功！商品ID: %s, 數量: %d", productId, amount);
                
                // 發送訊息至 Kafka
                kafkaTemplate.send(TOPIC, notificationMessage);
                System.out.println("成功發送 Kafka 訊息：" + notificationMessage);
            }

        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "呼叫 Inventory Service 失敗：" + e.getMessage());
        }

        return result;
    }
}