package com.mx.agendamedicos.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rol {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fiid")
    private Long id;

    @Column(name = "fvnombre", nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(name = "ftfechacreacion", insertable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fvusucreacion", insertable = false, updatable = false)
    private String usuarioCreacion;

}
