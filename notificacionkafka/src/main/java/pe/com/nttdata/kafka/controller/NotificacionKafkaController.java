package pe.com.nttdata.kafka.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.nttdata.clientefeign.notificacionkafka.NotificacionKafkaRequest;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1/kafka")
public class NotificacionKafkaController {

    @Qualifier("mensajeKafkaTemplate")
    private KafkaTemplate<String, NotificacionKafkaRequest> kafkaTemplate;

    @Value("${topic}")
    private String topic;

    public NotificacionKafkaController(KafkaTemplate<String, NotificacionKafkaRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void enviarNotificacion(@RequestBody NotificacionKafkaRequest notificacionKafkaRequest) {
        kafkaTemplate.send(topic, notificacionKafkaRequest);
    }
}
