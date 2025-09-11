package com.manjinder.notification_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationType {
    private NotificationCategory notificationCategory;
    private int notificationPriority;
    /*
        Template 1 : Transactional Notifications
        Template 2 : Informational Notifications
     */
    private int templateNumber;
}
