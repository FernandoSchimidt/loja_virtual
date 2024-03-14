package com.fernandoschimidt.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandoschimidt.backend.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
