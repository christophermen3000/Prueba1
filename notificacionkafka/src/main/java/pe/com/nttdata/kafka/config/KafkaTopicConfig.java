package pe.com.nttdata.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${topics}")
    private String topic;
    @Bean
    public NewTopic nttdataTopic(){
        return TopicBuilder.name(topic).build();
    }
}
