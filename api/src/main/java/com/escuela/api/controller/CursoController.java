package com.escuela.api.controller;

import com.escuela.api.entity.Curso;
import com.escuela.api.repository.CursoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoRepository cursoRepository;

    public CursoController(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @GetMapping
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }

    @GetMapping("/{id}")
    public Curso obtener(@PathVariable Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        cursoRepository.deleteById(id);
    }
}

