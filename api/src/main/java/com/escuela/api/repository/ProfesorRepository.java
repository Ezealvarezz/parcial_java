package com.escuela.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.escuela.api.entity.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> { }
