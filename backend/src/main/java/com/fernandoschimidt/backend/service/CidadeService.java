package com.fernandoschimidt.backend.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandoschimidt.backend.entity.Cidade;
import com.fernandoschimidt.backend.repository.CidadeRepository;


@Service
public class CidadeService {

    
    @Autowired
    private CidadeRepository repository;

    public List<Cidade> buscarTodos() {
        return repository.findAll();
    }

    public Cidade inserir(Cidade cidade) {
        cidade.setDataCriacao(new Date(0));
        Cidade cidadeNovo = repository.save(cidade);
        return cidadeNovo;
    }

    public Cidade alterar(Cidade cidade) {
        cidade.setDataAtualizacao(new Date(0));
        return repository.saveAndFlush(cidade);

    }

    public void excluir(Long id) {
        Cidade cidade = repository.findById(id).get();
        repository.delete(cidade);
    }
    
}
