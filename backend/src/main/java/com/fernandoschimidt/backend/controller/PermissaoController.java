package com.fernandoschimidt.backend.controller;

import com.fernandoschimidt.backend.entity.Cidade;
import com.fernandoschimidt.backend.entity.Permissao;
import com.fernandoschimidt.backend.service.CidadeService;
import com.fernandoschimidt.backend.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api/permissao")
public class PermissaoController {

    @Autowired
    private PermissaoService service;

    @GetMapping("/")
    public java.util.List<Permissao> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping("/")
    public Permissao incluir(@RequestBody Permissao obj) {
        return service.inserir(obj);
    }

    @PutMapping("/")
    public Permissao alterar(@RequestBody Permissao obj) {
        return service.inserir(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }

}
