package com.neveriasystem.demo.controllers;

import com.neveriasystem.demo.models.Cliente;
import com.neveriasystem.demo.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    @PostMapping
    public Cliente guardar(@RequestBody Cliente cliente) {
        return service.guardar(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
