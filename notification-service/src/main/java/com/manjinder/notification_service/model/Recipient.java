package com.manjinder.notification_service.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Recipient {
    private String userId;
    private String userName;
}
