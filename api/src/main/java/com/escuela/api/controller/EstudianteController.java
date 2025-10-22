package com.escuela.api.controller;

import com.escuela.api.entity.Estudiante;
import com.escuela.api.repository.EstudianteRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteRepository estudianteRepository;

    public EstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @GetMapping
    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @GetMapping("/{id}")
    public Estudiante obtener(@PathVariable Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        estudianteRepository.deleteById(id);
    }
}

