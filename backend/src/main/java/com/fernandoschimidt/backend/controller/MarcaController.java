package com.fernandoschimidt.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandoschimidt.backend.entity.Marca;
import com.fernandoschimidt.backend.service.MarcaService;

@RestController()
@RequestMapping("api/marca")
public class MarcaController {

    @Autowired
    private MarcaService service;

    @GetMapping("/")
    public java.util.List<Marca> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping("/")
    public Marca incluir(@RequestBody Marca marca) {
        return service.inserir(marca);
    }

    @PutMapping("/")
    public Marca alterar(@RequestBody Marca marca) {
        return service.inserir(marca);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }

}
