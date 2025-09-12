package com.manjinder.notification_service.dto;

public enum NotificationPreference {
    EMAIL, // Email channel via SendGrid
    SMS, //SMMS channel via Twilio
    PUSH //Push notification channel
}

