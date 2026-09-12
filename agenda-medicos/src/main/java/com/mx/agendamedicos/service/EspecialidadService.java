package com.mx.agendamedicos.service;

import com.mx.agendamedicos.entity.Especialidad;
import com.mx.agendamedicos.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<Especialidad> listarTodas() {
        return especialidadRepository.findAll();
    }
}