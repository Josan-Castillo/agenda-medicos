package com.mx.agendamedicos.service;

import com.mx.agendamedicos.dto.GuardiaRequest;
import com.mx.agendamedicos.entity.Guardia;
import com.mx.agendamedicos.entity.Rotacion;
import com.mx.agendamedicos.entity.Servicio;
import com.mx.agendamedicos.entity.Usuario;
import com.mx.agendamedicos.repository.GuardiaRepository;
import com.mx.agendamedicos.repository.RotacionRepository;
import com.mx.agendamedicos.repository.ServicioRepository;
import com.mx.agendamedicos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuardiaService {

    @Autowired
    private GuardiaRepository guardiaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ServicioRepository servicioRepository;

    @Autowired
    private RotacionRepository rotacionRepository;

    public List<Guardia> listarTodas() {
        return guardiaRepository.findAll();
    }

    public Guardia crear(GuardiaRequest request) {
        Usuario usuario = usuarioRepository.findById(request.getUsuarioId())
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Servicio servicio = servicioRepository.findById(request.getServicioId())
            .orElseThrow(() -> new RuntimeException("Servicio no encontrado"));

        Guardia guardia = new Guardia();
        guardia.setUsuario(usuario);
        guardia.setServicio(servicio);
        guardia.setFechaHoraInicio(request.getFechaHoraInicio());
        guardia.setFechaHoraFin(request.getFechaHoraFin());
        guardia.setTipo(request.getTipo());

        // La rotación es opcional: solo la buscamos si mandaron un ID
        if (request.getRotacionId() != null) {
            Rotacion rotacion = rotacionRepository.findById(request.getRotacionId())
                .orElseThrow(() -> new RuntimeException("Rotación no encontrada"));
            guardia.setRotacion(rotacion);
        }

        return guardiaRepository.save(guardia);
    }
}