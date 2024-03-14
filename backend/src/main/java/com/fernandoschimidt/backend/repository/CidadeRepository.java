package com.fernandoschimidt.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandoschimidt.backend.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
