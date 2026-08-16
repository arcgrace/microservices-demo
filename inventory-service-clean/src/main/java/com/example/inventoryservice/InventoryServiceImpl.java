package com.example.inventoryservice;

import com.example.inventoryservice.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@GrpcService
public class InventoryServiceImpl extends InventoryServiceGrpc.InventoryServiceImplBase {

    private final Map<String, Integer> stockMap = new ConcurrentHashMap<>() {{
        put("prod-123", 100);
        put("prod-456", 50);
    }};

    @Override
    public void getStock(StockRequest request, StreamObserver<StockResponse> responseObserver) {
        String productId = request.getProductId();
        int quantity = stockMap.getOrDefault(productId, 0);

        StockResponse response = StockResponse.newBuilder()
                .setProductId(productId)
                .setQuantity(quantity)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deductStock(DeductStockRequest request, StreamObserver<DeductStockResponse> responseObserver) {
        String productId = request.getProductId();
        int amount = request.getAmount();
        int currentStock = stockMap.getOrDefault(productId, 0);

        if (currentStock < amount) {
            DeductStockResponse response = DeductStockResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("庫存不足！目前剩餘：" + currentStock)
                    .setRemainingQuantity(currentStock)
                    .build();
            responseObserver.onNext(response);
        } else {
            int remaining = currentStock - amount;
            stockMap.put(productId, remaining);

            DeductStockResponse response = DeductStockResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("扣減成功！")
                    .setRemainingQuantity(remaining)
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getAllStocks(EmptyRequest request, StreamObserver<StockListResponse> responseObserver) {
        StockListResponse.Builder builder = StockListResponse.newBuilder();

        stockMap.forEach((productId, quantity) -> {
            builder.addStocks(StockResponse.newBuilder()
                    .setProductId(productId)
                    .setQuantity(quantity)
                    .build());
        });

        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}