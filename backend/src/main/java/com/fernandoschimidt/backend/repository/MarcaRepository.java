package com.fernandoschimidt.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandoschimidt.backend.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
