package com.escuela.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.escuela.api.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> { }
