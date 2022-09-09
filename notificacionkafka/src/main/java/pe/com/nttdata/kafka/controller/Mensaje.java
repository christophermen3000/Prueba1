package pe.com.nttdata.kafka.controller;

import java.time.LocalDateTime;

public record Mensaje(String mensaje, LocalDateTime created){
}
