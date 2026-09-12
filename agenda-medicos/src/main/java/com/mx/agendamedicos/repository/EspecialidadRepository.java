package com.mx.agendamedicos.repository;

import com.mx.agendamedicos.entity.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadRepository extends JpaRepository<Especialidad, Long> {
}