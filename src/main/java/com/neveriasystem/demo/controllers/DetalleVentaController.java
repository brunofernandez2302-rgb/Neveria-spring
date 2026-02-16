package com.neveriasystem.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.neveriasystem.demo.models.DetalleVenta;
import com.neveriasystem.demo.services.DetalleVentaService;

@RestController
@RequestMapping("/detalles-venta")
public class DetalleVentaController {

    private final DetalleVentaService service;

    public DetalleVentaController(DetalleVentaService service) {
        this.service = service;
    }

    @GetMapping
    public List<DetalleVenta> listar() {
        return service.listar();
    }

    @PostMapping
    public DetalleVenta guardar(@RequestBody DetalleVenta detalleVenta) {
        return service.guardar(detalleVenta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
