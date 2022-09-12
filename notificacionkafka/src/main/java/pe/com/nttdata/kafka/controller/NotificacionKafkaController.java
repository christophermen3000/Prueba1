package pe.com.nttdata.kafka.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.nttdata.clientefeign.notificacionkafka.NotificacionKafkaRequest;
import pe.com.nttdata.kafka.service.INotificacionService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1/kafka")
@AllArgsConstructor
public class NotificacionKafkaController {

    private final INotificacionService notificacionService;

    @PostMapping
    public void enviarNotificacion(@RequestBody NotificacionKafkaRequest notificacionKafkaRequest) {
        notificacionService.enviarNotificacion(notificacionKafkaRequest);
    }
}
