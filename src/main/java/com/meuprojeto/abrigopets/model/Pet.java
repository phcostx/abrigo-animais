package com.meuprojeto.abrigopets.model;

import jakarta.persistence.*;

@Entity
@Table(name ="pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo;
    private String sexo;
    private String idade;
    private String raca;

    public Pet(Long id, String nome, String tipo, String sexo, String idade, String raca) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.sexo = sexo;
        this.idade = idade;
        this.raca = raca;
    }

    public Pet() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
