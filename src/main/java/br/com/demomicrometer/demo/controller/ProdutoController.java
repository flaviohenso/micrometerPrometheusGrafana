package br.com.demomicrometer.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

    /*
     * Endpoint para listar todos os produtos mockados
     */
    @GetMapping("/produtos")
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1L, "Produto 1", 10.0));
        produtos.add(new Produto(2L, "Produto 2", 20.0));
        produtos.add(new Produto(3L, "Produto 3", 30.0));
        return ResponseEntity.ok(produtos);
    }

}
