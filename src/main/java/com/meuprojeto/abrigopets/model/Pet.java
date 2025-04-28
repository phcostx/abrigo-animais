package com.meuprojeto.abrigopets.model;

import jakarta.persistence.*;

@Entity
@Table(name ="pets")
public class Pet {

    public enum Sexo {
        M, F
    }

    public enum Status {
        ADOTADO,
        NAO_ADOTADO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, length = 25)
    private String nome;

    @Column(nullable = false, length = 25)
    private String tipo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 1)
    private Sexo sexo;

    @Column(nullable = false, length = 100)
    private String idade;

    @Column(nullable = false, length = 25)
    private String raca;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    public Pet(Long id, String nome, String tipo, Sexo sexo, String idade, String raca, Status status) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
