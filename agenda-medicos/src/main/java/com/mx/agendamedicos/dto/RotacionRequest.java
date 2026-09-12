package com.mx.agendamedicos.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RotacionRequest {
    private Long usuarioId;
    private Long servicioId;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}