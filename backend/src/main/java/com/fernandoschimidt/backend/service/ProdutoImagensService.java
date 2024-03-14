package com.fernandoschimidt.backend.service;

import com.fernandoschimidt.backend.entity.Produto;
import com.fernandoschimidt.backend.entity.ProdutoImagens;
import com.fernandoschimidt.backend.repository.ProdutoImagenRepository;
import com.fernandoschimidt.backend.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;


@Service
public class ProdutoImagensService {


    @Autowired
    private ProdutoImagenRepository produtoImagenRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoImagens> buscarTodos() {
        return produtoImagenRepository.findAll();
    }

    public ProdutoImagens inserir(Long idProduto, MultipartFile file) {
        Produto produto = produtoRepository.findById(idProduto).get();
        ProdutoImagens obj = new ProdutoImagens();

        try {
            if (!file.isEmpty()) {
                byte[] bytes = file.getBytes();
                String nomeImagem = String.valueOf(produto.getId()) + file.getOriginalFilename();
                Path caminho = Paths
                        .get("c:/imagens/" + String.valueOf(produto.getId()) + file.getOriginalFilename());
                Files.write(caminho, bytes);
                obj.setNome(nomeImagem);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        obj.setProduto(produto);
        obj.setDataCriacao(new Date());
        obj = produtoImagenRepository.saveAndFlush(obj);
        return obj;
    }

    public ProdutoImagens alterar(ProdutoImagens imagens) {
        return produtoImagenRepository.saveAndFlush(imagens);

    }

    public void excluir(Long id) {
        ProdutoImagens imagens = produtoImagenRepository.findById(id).get();
        produtoImagenRepository.delete(imagens);
    }

}
