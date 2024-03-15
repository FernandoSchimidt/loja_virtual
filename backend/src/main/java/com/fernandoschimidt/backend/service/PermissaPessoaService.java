package com.fernandoschimidt.backend.service;

import com.fernandoschimidt.backend.entity.Permissao;
import com.fernandoschimidt.backend.entity.PermissaoPessoa;
import com.fernandoschimidt.backend.entity.Pessoa;
import com.fernandoschimidt.backend.repository.PermissaoPessoaRepository;
import com.fernandoschimidt.backend.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PermissaPessoaService {

    @Autowired
    private PermissaoPessoaRepository permissaoPessoaRepository;

    @Autowired
    private PermissaoRepository permissaoRepository;

    public void vincularPessoaPermissaoCliente(Pessoa pessoa) {
        List<Permissao> permissaoList = permissaoRepository.findByNome("cliente");
        if (permissaoList.size() > 0) {
            PermissaoPessoa permissaoPessoa = new PermissaoPessoa();
            permissaoPessoa.setPessoa(pessoa);
            permissaoPessoa.setPermissao(permissaoList.get(0));
//            permissaoPessoa.setDataCriacao((java.sql.Date) new Date());
            permissaoPessoaRepository.saveAndFlush(permissaoPessoa);
        }

    }
}
