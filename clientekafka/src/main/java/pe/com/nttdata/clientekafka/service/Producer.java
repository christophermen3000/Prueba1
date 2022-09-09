package pe.com.nttdata.clientekafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pe.com.nttdata.clientekafka.config.NotificacionKafkaRequest;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate<String, NotificacionKafkaRequest> kafkaTemplate;

    @Value("${topics}")
    private String topic;

    public void enviarMensaje(NotificacionKafkaRequest notificacionKafkaRequest) {
        this.kafkaTemplate.send(topic, notificacionKafkaRequest);
    }
}
