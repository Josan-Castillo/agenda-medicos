package com.mx.agendamedicos.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "guardias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Guardia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fiid")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fiidusuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fiidrotacion")
    private Rotacion rotacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fiidservicio", nullable = false)
    private Servicio servicio;

    @Column(name = "fdfechahorainicio", nullable = false)
    private LocalDateTime fechaHoraInicio;

    @Column(name = "fdfechahorafin", nullable = false)
    private LocalDateTime fechaHoraFin;

    @Column(name = "fvtipo", length = 50)
    private String tipo;

    @Column(name = "ftfechacreacion", insertable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fvusucreacion", insertable = false, updatable = false)
    private String usuarioCreacion;
}