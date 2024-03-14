package com.fernandoschimidt.backend.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandoschimidt.backend.entity.Categoria;
import com.fernandoschimidt.backend.repository.CategoriaRepository;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> buscarTodos() {
        return repository.findAll();
    }

    public Categoria inserir(Categoria categoria) {
        categoria.setDataCriacao(new Date(0));
        Categoria categoriaNova = repository.save(categoria);
        return categoriaNova;
    }

    public Categoria alterar(Categoria Categoria) {
        Categoria.setDataAtualizacao(new Date(0));
        return repository.saveAndFlush(Categoria);

    }

    public void excluir(Long id) {
        Categoria categoria = repository.findById(id).get();
        repository.delete(categoria);
    }

}
