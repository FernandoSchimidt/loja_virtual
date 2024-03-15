package com.fernandoschimidt.backend.dto;

import com.fernandoschimidt.backend.entity.Cidade;
import com.fernandoschimidt.backend.entity.Pessoa;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class PessoaClienteRequestDTO {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Cidade cidade;
    private String cep;

    public Pessoa converter(PessoaClienteRequestDTO pessoaClienteRequestDTO) {
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaClienteRequestDTO, pessoa);
        return pessoa;
    }
}
