package com.mx.agendamedicos.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fiid")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fiidespecia")
    private Especialidad especialidad;

    @Column(name = "fvnombre", nullable = false, length = 150)
    private String nombre;

    @Column(name = "fvemail", nullable = false, unique = true, length = 150)
    private String email;

    @Column(name = "fvpassword", nullable = false, length = 255)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "usuario_roles",
        joinColumns = @JoinColumn(name = "fiidusuario"),
        inverseJoinColumns = @JoinColumn(name = "fiidrol")
    )
    private Set<Rol> roles = new HashSet<>();

    @Column(name = "ftfechacreacion", insertable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fvusucreacion", insertable = false, updatable = false)
    private String usuarioCreacion;
}