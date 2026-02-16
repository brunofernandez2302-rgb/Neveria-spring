package com.neveriasystem.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neveriasystem.demo.models.Sucursal;
import com.neveriasystem.demo.services.SucursalService;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

    private final SucursalService service;

    public SucursalController(SucursalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sucursal> listar() {
        return service.listar();
    }

    @PostMapping
    public Sucursal guardar(@RequestBody Sucursal sucursal) {
        return service.guardar(sucursal);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    public SucursalService getService() {
        return service;
    }
}
