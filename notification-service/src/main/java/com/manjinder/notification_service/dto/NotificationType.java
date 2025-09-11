package com.manjinder.notification_service.dto;

public class NotificationType {
    /*
        Type 1 : Immediate Notifications
        Type 2 : Correspondence Notifications
     */
    private String notificationType;
    private int notificationPriority;
    /*
        Template 1 : Transactional Notifications
        Template 2 : Informational Notifications
     */
    private int templateNumber;
}
