package com.escuela.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.escuela.api.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> { }

