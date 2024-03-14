package com.fernandoschimidt.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "produto_imagens")
@Data
public class ProdutoImagens {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;

    private Date dataCriacao;

    private Date dataAtualizacao;
}
