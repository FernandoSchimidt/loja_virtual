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

import com.fernandoschimidt.backend.entity.Cidade;
import com.fernandoschimidt.backend.service.CidadeService;

@RestController()
@RequestMapping("api/cidade")
public class CidadeController {

    @Autowired
    private CidadeService service;

    @GetMapping("/")
    public java.util.List<Cidade> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping("/")
    public Cidade incluir(@RequestBody Cidade obj) {
        return service.inserir(obj);
    }

    @PutMapping("/")
    public Cidade alterar(@RequestBody Cidade obj) {
        return service.inserir(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }

}
