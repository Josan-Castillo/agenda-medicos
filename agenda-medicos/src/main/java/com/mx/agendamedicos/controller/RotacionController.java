package com.mx.agendamedicos.controller;

import com.mx.agendamedicos.dto.RotacionRequest;
import com.mx.agendamedicos.entity.Rotacion;
import com.mx.agendamedicos.service.RotacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rotaciones")
public class RotacionController {

    @Autowired
    private RotacionService rotacionService;

    @GetMapping
    public List<Rotacion> listar() {
        return rotacionService.listarTodas();
    }

    @PostMapping
    public Rotacion crear(@RequestBody RotacionRequest request) {
        return rotacionService.crear(request);
    }
}