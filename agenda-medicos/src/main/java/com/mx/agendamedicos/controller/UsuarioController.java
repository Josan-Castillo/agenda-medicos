package com.mx.agendamedicos.controller;

import com.mx.agendamedicos.dto.UsuarioRequest;
import com.mx.agendamedicos.entity.Usuario;
import com.mx.agendamedicos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarTodos();
    }

    @PostMapping
    public Usuario crear(@RequestBody UsuarioRequest request) {
        return usuarioService.crear(request);
    }
}