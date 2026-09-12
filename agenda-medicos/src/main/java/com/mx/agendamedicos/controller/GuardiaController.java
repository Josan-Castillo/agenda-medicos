package com.mx.agendamedicos.controller;

import com.mx.agendamedicos.dto.GuardiaRequest;
import com.mx.agendamedicos.entity.Guardia;
import com.mx.agendamedicos.service.GuardiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guardias")
public class GuardiaController {

    @Autowired
    private GuardiaService guardiaService;

    @GetMapping
    public List<Guardia> listar() {
        return guardiaService.listarTodas();
    }

    @PostMapping
    public Guardia crear(@RequestBody GuardiaRequest request) {
        return guardiaService.crear(request);
    }
}