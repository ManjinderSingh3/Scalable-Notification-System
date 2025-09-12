package com.manjinder.notification_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequest {
    private Recipient recipient;
    private List<NotificationPreference> notificationPreference; //Email, SMS or Push
    private NotificationType notificationType;
    private Content content;
}
