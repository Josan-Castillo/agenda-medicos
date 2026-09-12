package com.mx.agendamedicos.repository;

import com.mx.agendamedicos.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
