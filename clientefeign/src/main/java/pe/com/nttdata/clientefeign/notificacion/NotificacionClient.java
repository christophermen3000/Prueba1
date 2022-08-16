package pe.com.nttdata.clientefeign.notificacion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.com.nttdata.clientefeign.validar.cliente.ClienteCheckResponse;

@FeignClient(
        name = "notificacion",
        url = "${clientefeign.notificacion.url}"
)
public interface NotificacionClient {
    @PostMapping(path = "api/v1/notificacion")
    void enviarNotificacion(@RequestBody NotificacionRequest notificacionRequest);
}
