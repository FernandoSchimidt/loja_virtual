package com.fernandoschimidt.backend.controller;

import com.fernandoschimidt.backend.entity.Produto;
import com.fernandoschimidt.backend.entity.ProdutoImagens;
import com.fernandoschimidt.backend.service.ProdutoImagensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController()
@RequestMapping("api/produtoImagens")
public class ProdutoImagensController {
    @Autowired
    private ProdutoImagensService service;

    @GetMapping("/")
    public java.util.List<ProdutoImagens> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping("/")
    public ProdutoImagens incluir(@RequestParam("file") MultipartFile file,@RequestParam("idProduto") Long idProduto) {
        return service.inserir(idProduto, file);
    }

//    @PutMapping("/")
//    public ProdutoImagens alterar(@RequestBody ProdutoImagens obj) {
//        return service.inserir(obj);
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
