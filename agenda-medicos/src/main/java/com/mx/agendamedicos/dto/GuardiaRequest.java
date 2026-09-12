package com.mx.agendamedicos.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuardiaRequest {
    private Long usuarioId;
    private Long rotacionId; // opcional, puede venir null
    private Long servicioId;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private String tipo;
}