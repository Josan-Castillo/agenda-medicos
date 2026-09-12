package com.mx.agendamedicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.agendamedicos.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
