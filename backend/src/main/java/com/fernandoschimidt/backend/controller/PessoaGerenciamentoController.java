package com.fernandoschimidt.backend.controller;

import com.fernandoschimidt.backend.entity.Pessoa;
import com.fernandoschimidt.backend.service.PessoaGerenciamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoa-gerenciamento")
public class PessoaGerenciamentoController {

    @Autowired
    private PessoaGerenciamentoService pessoaGerenciamentoService;

    @PostMapping("/recuperar-codigo")
    public String recuperarCodigo(@RequestBody Pessoa pessoa) {

        return pessoaGerenciamentoService.solicitarCodigo(pessoa.getEmail());
    }

    @PostMapping("/alterar-senha")
    public String alterarSenha(@RequestBody Pessoa pessoa) {

        return pessoaGerenciamentoService.alterarSenha(pessoa);
    }
}
