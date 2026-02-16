package com.neveriasystem.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.neveriasystem.demo.models.Producto;
import com.neveriasystem.demo.services.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Producto> listar() {
        return service.listar();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return service.guardar(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}

