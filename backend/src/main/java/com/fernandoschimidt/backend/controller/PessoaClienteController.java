package com.fernandoschimidt.backend.controller;

import com.fernandoschimidt.backend.dto.PessoaClienteRequestDTO;
import com.fernandoschimidt.backend.entity.Pessoa;
import com.fernandoschimidt.backend.service.PessoaClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api/cliente")
public class PessoaClienteController {

    @Autowired
    private PessoaClienteService service;


    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO obj) {
        return service.inserir(obj);
    }


}
