package com.neveriasystem.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.neveriasystem.demo.models.Venta;
import com.neveriasystem.demo.services.VentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService service;

    public VentaController(VentaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Venta> listar() {
        return service.listar();
    }

    @PostMapping
    public Venta guardar(@RequestBody Venta venta) {
        return service.guardar(venta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
