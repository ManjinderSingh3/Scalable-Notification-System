package com.manjinder.notification_service.controller;

import com.manjinder.notification_service.service.KafkaService;
import com.manjinder.notification_service.service.NotificationService;
import com.manjinder.notification_service.service.RedisService;
import org.apache.kafka.common.errors.InvalidRequestException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.manjinder.notification_service.dto.NotificationRequest;

@RestController
@RequestMapping("/api")
public class NotificationController {
    RedisService redisService;
    KafkaService kafkaService;
    NotificationService notificationService;

    public NotificationController(RedisService redisService, KafkaService kafkaService, NotificationService notificationService){
        this.redisService = redisService;
        this.kafkaService = kafkaService;
        this.notificationService = notificationService;
    }

    @PostMapping("send-notification")
    public ResponseEntity<?> sendNotification(@RequestBody NotificationRequest notificationRequest){
        try{
            System.out.println("Incoming Request : " + notificationRequest );
            return ResponseEntity.accepted().body("Notification accepted for processing");
        }catch(InvalidRequestException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
