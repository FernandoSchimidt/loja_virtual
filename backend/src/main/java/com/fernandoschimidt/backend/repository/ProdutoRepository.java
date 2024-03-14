package com.fernandoschimidt.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandoschimidt.backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
