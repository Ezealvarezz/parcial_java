package com.escuela.api.controller;

import com.escuela.api.entity.Profesor;
import com.escuela.api.repository.ProfesorRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    private final ProfesorRepository profesorRepository;

    public ProfesorController(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @GetMapping
    public List<Profesor> listar() {
        return profesorRepository.findAll();
    }

    @PostMapping
    public Profesor crear(@RequestBody Profesor profesor) {
        return profesorRepository.save(profesor);
    }
}

