package com.manjinder.notification_service.controller;

import org.apache.kafka.common.errors.InvalidRequestException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.manjinder.notification_service.model.NotificationRequest;

@RestController
//@RequestMapping("/api")
public class NotificationController {

    @Value("${spring.datasource.url}")
    private String databaseURL;

    @GetMapping("/")
    public String root(){
        return databaseURL;
    }

    @GetMapping("/health")
    public String getHealth(){
        return "Running";
    }

    @PostMapping("send-notification")
    public ResponseEntity<?> sendNotification(@RequestBody NotificationRequest notificationRequest){

        try{
            return ResponseEntity.accepted().body("Notification accepted for processing");
        }catch(InvalidRequestException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
