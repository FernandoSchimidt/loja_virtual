package com.fernandoschimidt.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandoschimidt.backend.entity.Estado;

public interface EstadorRepository extends JpaRepository<Estado, Long> {

}
