package com.mx.agendamedicos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.agendamedicos.entity.Rol;
import com.mx.agendamedicos.repository.RolRepository;

@Service
public class RolService {
	
	@Autowired
	private RolRepository rolRepository;
	
	public List<Rol> listarTodos() {
        return rolRepository.findAll();
    }
}
