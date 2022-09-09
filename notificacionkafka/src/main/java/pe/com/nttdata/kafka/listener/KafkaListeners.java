package pe.com.nttdata.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import pe.com.nttdata.kafka.controller.Mensaje;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "${topic}",
            groupId = "${groupId}",
            containerFactory = "${containerFactory}"
    )
    void listener(Mensaje data){
        System.out.println("Listener: "+ data);
    }
}
