package com.example.notification_service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private static final Logger log = LoggerFactory.getLogger(NotificationService.class);

    // @KafkaListener 會自動監聽指定的 Kafka Topic
    @KafkaListener(topics = "order-events", groupId = "notification-group")
    public void consumeOrderEvent(String message) {
        log.info("📩 [Kafka Consumer] 收到來自 order-events 的訂單通知事件：{}", message);
        
        // 模擬發送 Email 通知
        sendEmailNotification(message);
    }

    private void sendEmailNotification(String orderDetails) {
        log.info("📧 [Email Gateway] 已成功發送通知信給客戶！訂單內容：{}", orderDetails);
    }
}