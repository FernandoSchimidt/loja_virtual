package com.fernandoschimidt.backend.repository;

import com.fernandoschimidt.backend.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

    List<Permissao> findByNome(String nome);
}
