package com.manjinder.notification_service.dto;

public enum NotificationPreference {
    EMAIL, // Email channel via SendGrid
    SMS, //SMS channel via Twilio
    PUSH //Push notification channel
}

