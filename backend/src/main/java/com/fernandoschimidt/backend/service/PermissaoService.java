package com.fernandoschimidt.backend.service;

import com.fernandoschimidt.backend.entity.Cidade;
import com.fernandoschimidt.backend.entity.Permissao;
import com.fernandoschimidt.backend.repository.CidadeRepository;
import com.fernandoschimidt.backend.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;


@Service
public class PermissaoService {


    @Autowired
    private PermissaoRepository repository;

    public List<Permissao> buscarTodos() {
        return repository.findAll();
    }

    public Permissao inserir(Permissao obj) {
        obj.setDataCriacao(new Date(0));
        Permissao objNovo = repository.save(obj);
        return objNovo;
    }

    public Permissao alterar(Permissao obj) {
        obj.setDataAtualizacao(new Date(0));
        return repository.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Permissao obj = repository.findById(id).get();
        repository.delete(obj);
    }

}
