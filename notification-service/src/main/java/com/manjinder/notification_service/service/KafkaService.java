package com.manjinder.notification_service.service;

import com.manjinder.notification_service.data.entity.NotificationTemplate;
import com.manjinder.notification_service.dto.NotificationRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    private KafkaTemplate kafkaTemplate;

    public KafkaService(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendNotification(NotificationRequest notificationRequest){

    }
}
