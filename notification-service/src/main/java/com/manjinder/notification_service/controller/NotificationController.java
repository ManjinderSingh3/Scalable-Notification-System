package com.manjinder.notification_service.controller;

import org.apache.kafka.common.errors.InvalidRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.manjinder.notification_service.model.NotificationRequest;

@RestController
@RequestMapping("/api")
public class NotificationController {

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
