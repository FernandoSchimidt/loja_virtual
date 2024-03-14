package com.fernandoschimidt.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "permissao")
@Data
public class Permissao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private Date dataCriacao;
    private Date dataAtualizacao;
}
