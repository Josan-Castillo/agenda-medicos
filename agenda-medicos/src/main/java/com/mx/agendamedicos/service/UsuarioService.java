package com.mx.agendamedicos.service;

import com.mx.agendamedicos.dto.UsuarioRequest;
import com.mx.agendamedicos.entity.Especialidad;
import com.mx.agendamedicos.entity.Rol;
import com.mx.agendamedicos.entity.Usuario;
import com.mx.agendamedicos.repository.EspecialidadRepository;
import com.mx.agendamedicos.repository.RolRepository;
import com.mx.agendamedicos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Autowired
    private RolRepository rolRepository;

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario crear(UsuarioRequest request) {
        Usuario usuario = new Usuario();
        usuario.setNombre(request.getNombre());
        usuario.setEmail(request.getEmail());
        usuario.setPassword(request.getPassword()); // sin hashear todavía, viene después con Security

        if (request.getEspecialidadId() != null) {
            Especialidad especialidad = especialidadRepository.findById(request.getEspecialidadId())
                .orElseThrow(() -> new RuntimeException("Especialidad no encontrada"));
            usuario.setEspecialidad(especialidad);
        }

        if (request.getRolesIds() != null && !request.getRolesIds().isEmpty()) {
            Set<Rol> roles = new HashSet<>(rolRepository.findAllById(request.getRolesIds()));
            usuario.setRoles(roles);
        }

        return usuarioRepository.save(usuario);
    }
}