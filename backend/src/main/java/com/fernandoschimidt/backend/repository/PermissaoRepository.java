package com.fernandoschimidt.backend.repository;

import com.fernandoschimidt.backend.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}
