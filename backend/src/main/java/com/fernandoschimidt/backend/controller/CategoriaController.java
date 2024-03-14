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

import com.fernandoschimidt.backend.entity.Categoria;
import com.fernandoschimidt.backend.service.CategoriaService;


@RestController()
@RequestMapping("api/categoria")
public class CategoriaController {
    

     @Autowired
    private CategoriaService service;

    @GetMapping("/")
    public java.util.List<Categoria> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping("/")
    public Categoria incluir(@RequestBody Categoria categoria) {
        return service.inserir(categoria);
    }

    @PutMapping("/")
    public Categoria alterar(@RequestBody Categoria categoria) {
        return service.inserir(categoria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
