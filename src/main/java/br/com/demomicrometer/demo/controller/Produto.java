package br.com.demomicrometer.demo.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Produto {
    
    @JsonProperty("id")
    private Long id;
    
    @JsonProperty("nome")
    private String nome;
    
    @JsonProperty("preco")
    private double preco;

    // Construtor público
    public Produto(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
