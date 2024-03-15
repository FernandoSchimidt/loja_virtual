package com.fernandoschimidt.backend.controller;

import com.fernandoschimidt.backend.entity.Pessoa;
import com.fernandoschimidt.backend.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping("/")
    public java.util.List<Pessoa> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping("/")
    public Pessoa incluir(@RequestBody Pessoa obj) {
        return service.inserir(obj);
    }

    @PutMapping("/")
    public Pessoa alterar(@RequestBody Pessoa obj) {
        return service.inserir(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
