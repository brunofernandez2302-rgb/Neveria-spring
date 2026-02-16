package com.neveriasystem.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.neveriasystem.demo.models.Pago;
import com.neveriasystem.demo.services.PagoService;

@RestController
@RequestMapping("/pagos")
public class PagoController {

    private final PagoService service;

    public PagoController(PagoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pago> listar() {
        return service.listar();
    }

    @PostMapping
    public Pago guardar(@RequestBody Pago pago) {
        return service.guardar(pago);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
