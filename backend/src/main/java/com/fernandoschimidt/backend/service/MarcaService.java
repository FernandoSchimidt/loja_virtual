package com.fernandoschimidt.backend.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandoschimidt.backend.entity.Marca;
import com.fernandoschimidt.backend.repository.MarcaRepository;


@Service
public class MarcaService {

    @Autowired
    private MarcaRepository repository;

    public List<Marca> buscarTodos() {
        return repository.findAll();
    }

    public Marca inserir(Marca marca) {
        marca.setDataCriacao(new Date(0));
        Marca marcaNova = repository.save(marca);
        return marcaNova;
    }

    public Marca alterar(Marca Marca) {
        Marca.setDataAtualizacao(new Date(0));
        return repository.saveAndFlush(Marca);

    }

    public void excluir(Long id) {
        Marca marca = repository.findById(id).get();
        repository.delete(marca);
    }
}
