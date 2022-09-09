package pe.com.nttdata.clientekafka.config;

public record NotificacionKafkaRequest(Integer clienteId, String clienteEmail, String mensaje) {
}
