package com.manjinder.notification_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.config.TopicBuilder;
import static com.manjinder.notification_service.constants.Constants.*;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic emailTopic(){
        // Design Pattern used : Builder pattern to build Kafka topic
        return TopicBuilder.name(NOTIFICATIONS_DELIVERY_TOPIC1).build();
    }

    @Bean
    public NewTopic smsTopic(){
        // Design Pattern used : Builder pattern to build Kafka topic
        return TopicBuilder.name(NOTIFICATIONS_DELIVERY_TOPIC2).build();
    }

    @Bean
    public NewTopic pushNotificationsTopic(){
        return TopicBuilder.name(NOTIFICATIONS_DELIVERY_TOPIC3).build();
    }
}
