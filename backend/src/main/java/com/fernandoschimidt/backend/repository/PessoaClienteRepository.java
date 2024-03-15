package com.fernandoschimidt.backend.repository;

import com.fernandoschimidt.backend.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long> {

}
