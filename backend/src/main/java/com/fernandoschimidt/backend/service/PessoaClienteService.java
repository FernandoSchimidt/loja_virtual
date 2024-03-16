package com.fernandoschimidt.backend.service;

import com.fernandoschimidt.backend.dto.PessoaClienteRequestDTO;
import com.fernandoschimidt.backend.entity.Pessoa;
import com.fernandoschimidt.backend.repository.PessoaClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class PessoaClienteService {

    @Autowired
    private PessoaClienteRepository pessoaClienteRepository;
    @Autowired
    private PermissaPessoaService permissaPessoaService;
    @Autowired
    private EmailService emailService;

    public Pessoa inserir(PessoaClienteRequestDTO pessoaClienteRequestDTO) {
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);
        pessoa.setDataCriacao(new Date(0));
        Pessoa objNovo = pessoaClienteRepository.saveAndFlush(pessoa);
        permissaPessoaService.vincularPessoaPermissaoCliente(objNovo);
//        emailService.enviarEmailTexto(objNovo.getEmail(), "Cadastro na Loja Schimidt Stores", "O registro na loja foi realizado com sucesso");
        Map<String,Object> propriedades = new HashMap<>();
        propriedades.put("nome",objNovo.getNome());
        propriedades.put("mensagem","O registro na loja foi realizado com sucesso");
        emailService.enviar(objNovo.getEmail(),"Cadastro na Loja Schimidt Store",propriedades);
        return objNovo;
    }


}
