package com.manjinder.notification_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequest {
    private Recipient recipient;
    private NotificationPreference notificationPreference; //Email, SMS or Push
    private NotificationType notificationType;
    private Content content;
}
