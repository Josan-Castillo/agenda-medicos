package com.mx.agendamedicos.service;

import com.mx.agendamedicos.dto.RotacionRequest;
import com.mx.agendamedicos.entity.Rotacion;
import com.mx.agendamedicos.entity.Servicio;
import com.mx.agendamedicos.entity.Usuario;
import com.mx.agendamedicos.repository.RotacionRepository;
import com.mx.agendamedicos.repository.ServicioRepository;
import com.mx.agendamedicos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotacionService {

    @Autowired
    private RotacionRepository rotacionRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ServicioRepository servicioRepository;

    public List<Rotacion> listarTodas() {
        return rotacionRepository.findAll();
    }

    public Rotacion crear(RotacionRequest request) {
        Usuario usuario = usuarioRepository.findById(request.getUsuarioId())
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Servicio servicio = servicioRepository.findById(request.getServicioId())
            .orElseThrow(() -> new RuntimeException("Servicio no encontrado"));

        Rotacion rotacion = new Rotacion();
        rotacion.setUsuario(usuario);
        rotacion.setServicio(servicio);
        rotacion.setFechaInicio(request.getFechaInicio());
        rotacion.setFechaFin(request.getFechaFin());

        return rotacionRepository.save(rotacion);
    }
}