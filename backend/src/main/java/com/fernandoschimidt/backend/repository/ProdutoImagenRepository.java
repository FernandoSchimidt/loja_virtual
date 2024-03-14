package com.fernandoschimidt.backend.repository;

import com.fernandoschimidt.backend.entity.ProdutoImagens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoImagenRepository extends JpaRepository<ProdutoImagens, Long> {
}
