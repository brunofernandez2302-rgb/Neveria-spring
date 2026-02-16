package com.neveriasystem.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.neveriasystem.demo.models.Empleado;
import com.neveriasystem.demo.services.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoService service;

    public EmpleadoController(EmpleadoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Empleado> listar() {
        return service.listar();
    }

    @PostMapping
    public Empleado guardar(@RequestBody Empleado empleado) {
        return service.guardar(empleado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
