package com.manjinder.notification_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Content {
    private String subject; // email and push notification subject
    private String body;
    private List<String> attachments;
    private Map<String, String> placeholders;
    private String link; // For push notification

}
