package com.mx.agendamedicos.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rotaciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rotacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fiid")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fiidusuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fiidservicio", nullable = false)
    private Servicio servicio;

    @Column(name = "fdfechainicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fdfechafin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "ftfechacreacion", insertable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fvusucreacion", insertable = false, updatable = false)
    private String usuarioCreacion;
}