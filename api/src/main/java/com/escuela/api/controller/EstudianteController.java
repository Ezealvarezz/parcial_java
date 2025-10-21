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

    // Listar todos los estudiantes
    @GetMapping
    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }

    // Crear un nuevo estudiante
    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    // Obtener un estudiante por ID
    @GetMapping("/{id}")
    public Estudiante obtener(@PathVariable Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    // Eliminar un estudiante por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        estudianteRepository.deleteById(id);
    }
}

