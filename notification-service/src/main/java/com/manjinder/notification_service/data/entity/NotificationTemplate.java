package com.manjinder.notification_service.data.entity;

import com.manjinder.notification_service.dto.NotificationPreference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="notification_template")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="template_number")
    private int templateNumber;

    @Column(name="template_name")
    private String templateName; // Transactional, Informational, Promotional

    @Column(name="priority")
    private int priority;

    @Column(name="channel")
    @Enumerated(EnumType.STRING)
    private NotificationPreference channel;

    @Column(name="subject")
    private String subject;

    @Column(name="body")
    private String body;

    @Column(name="created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
