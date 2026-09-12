package com.mx.agendamedicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.agendamedicos.entity.Especialidad;
import com.mx.agendamedicos.entity.Hospital;
import com.mx.agendamedicos.repository.HospitalRepository;

@Service
public class HospitalService {
	
	@Autowired
	private HospitalRepository hospitalRepository;
	
	public List<Hospital> listarTodos() {
        return hospitalRepository.findAll();
    }
}
