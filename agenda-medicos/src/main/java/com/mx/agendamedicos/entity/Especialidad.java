package com.mx.agendamedicos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "especialidades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fiid")
    private Long id;

    @Column(name = "fvnombre", nullable = false, unique = true, length = 100)
    private String nombre;

    @Column(name = "ftfechacreacion", insertable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fvusucreacion", insertable = false, updatable = false)
    private String usuarioCreacion;
}