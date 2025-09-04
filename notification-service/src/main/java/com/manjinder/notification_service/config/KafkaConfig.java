package com.manjinder.notification_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import static com.manjinder.notification_service.constants.Constants.*;

@Configuration
public class KafkaConfig {

    @Bean
    public KafkaAdmin.NewTopics createTopics(){
        // Design Pattern used : Builder pattern to build Kafka topic
        NewTopic priorityOneTopic = TopicBuilder.name(PRIORITY_ONE_TOPIC).build();
        NewTopic priorityTwoTopic = TopicBuilder.name(PRIORITY_TWO_TOPIC).build();
        NewTopic priorityThreeTopic = TopicBuilder.name(PRIORITY_THREE_TOPIC).build();

        return new KafkaAdmin.NewTopics(priorityOneTopic);
    }
}
