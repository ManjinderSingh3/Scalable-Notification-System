package com.manjinder.notification_service.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="NotificationTemplate")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int templateNumber;

    /*
    Transactional, Informational, Promotional
     */
    private String templateName;

    @Column(name="priority")
    private int priority;

    @Column(name="created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name="updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();
}
