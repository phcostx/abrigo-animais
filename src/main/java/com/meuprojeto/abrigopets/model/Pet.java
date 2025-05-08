package com.meuprojeto.abrigopets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="pets")
public class Pet {

    public enum Sexo {
        MACHO,
        FEMEA
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", columnDefinition = "varchar(10) CHECK (sexo IN ('MACHO', 'FEMEA'))")
    private Sexo sexo;
    
    private String idade;
    private String raca;
    private String status;

    public Pet(Long id, String nome, String tipo, Sexo sexo, String idade, String raca, String status) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.sexo = sexo;
        this.idade = idade;
        this.raca = raca;
        this.status = status;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
