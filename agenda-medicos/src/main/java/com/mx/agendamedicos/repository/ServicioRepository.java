package com.mx.agendamedicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mx.agendamedicos.entity.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {
}
