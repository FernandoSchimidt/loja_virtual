package com.fernandoschimidt.backend.service;

import com.fernandoschimidt.backend.entity.Pessoa;
import com.fernandoschimidt.backend.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;


@Service
public class PessoaService {


    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> buscarTodos() {
        return repository.findAll();
    }

    public Pessoa inserir(Pessoa pessoa) {
        pessoa.setDataCriacao(new Date(0));
        Pessoa pessoaNovo = repository.save(pessoa);
        return pessoaNovo;
    }

    public Pessoa alterar(Pessoa pessoa) {
        pessoa.setDataAtualizacao(new Date(0));
        return repository.saveAndFlush(pessoa);

    }

    public void excluir(Long id) {
        Pessoa pessoa = repository.findById(id).get();
        repository.delete(pessoa);
    }

}
