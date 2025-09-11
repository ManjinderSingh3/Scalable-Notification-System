package com.manjinder.notification_service.service;

import com.manjinder.notification_service.data.entity.NotificationTemplate;
import com.manjinder.notification_service.data.repository.NotificationTemplateRepository;
import com.manjinder.notification_service.dto.NotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateRequestCustomizer;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {
    private RedisService redisSerice;
    private NotificationTemplateRepository notificationTemplateRepository;

    public NotificationService(RedisService redisSerice, NotificationTemplateRepository notificationTemplateRepository ){
        this.redisSerice = redisSerice;
        this.notificationTemplateRepository = notificationTemplateRepository;
    }

    public void validateRequest(NotificationRequest notificationRequest){

    }

}
