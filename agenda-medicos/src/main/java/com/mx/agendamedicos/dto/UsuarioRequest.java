package com.mx.agendamedicos.dto;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioRequest {
    private String nombre;
    private String email;
    private String password;
    private Long especialidadId;
    private Set<Long> rolesIds;
}