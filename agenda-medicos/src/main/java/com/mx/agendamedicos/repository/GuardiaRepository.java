package com.mx.agendamedicos.repository;

import com.mx.agendamedicos.entity.Guardia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuardiaRepository extends JpaRepository<Guardia, Long> {
}