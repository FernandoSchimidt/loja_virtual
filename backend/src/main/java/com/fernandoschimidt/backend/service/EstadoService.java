package com.fernandoschimidt.backend.service;

import java.sql.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandoschimidt.backend.entity.Estado;
import com.fernandoschimidt.backend.repository.EstadorRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadorRepository repository;

    public List<Estado> buscarTodos() {
        return repository.findAll();
    }

    public Estado inserir(Estado estado) {
        estado.setDataCriacao(new Date(0));
        Estado estadoNovo = repository.save(estado);
        return estadoNovo;
    }

    public Estado alterar(Estado estado) {
        estado.setDataAtualizacao(new Date(0));
        return repository.saveAndFlush(estado);

    }

    public void excluir(Long id) {
        Estado estado = repository.findById(id).get();
        repository.delete(estado);
    }

}
