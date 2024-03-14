package com.fernandoschimidt.backend.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandoschimidt.backend.entity.Produto;
import com.fernandoschimidt.backend.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> buscarTodos() {
        return repository.findAll();
    }

    public Produto inserir(Produto obj) {
        obj.setDataCriacao(new Date(0));
        Produto objNovo = repository.save(obj);
        return objNovo;
    }

    public Produto alterar(Produto obj) {
        obj.setDataAtualizacao(new Date(0));
        return repository.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Produto obj = repository.findById(id).get();
        repository.delete(obj);
    }

}
