package com.neveriasystem.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.neveriasystem.demo.models.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
