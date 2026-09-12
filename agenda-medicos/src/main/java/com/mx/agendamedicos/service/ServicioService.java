package com.mx.agendamedicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.agendamedicos.entity.Servicio;
import com.mx.agendamedicos.repository.ServicioRepository;

@Service
public class ServicioService {
	
	@Autowired
	private ServicioRepository servicioRepository;
	
	public List<Servicio> listarTodos() {
        return servicioRepository.findAll();
    }
}
