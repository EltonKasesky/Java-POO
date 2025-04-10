package com.example.java;

public class Pessoa {
    private String nome;
    private EstadoCivil estadoCivil;

    public Pessoa(String nome, EstadoCivil estadoCivil) {
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                ", nome: " + this.getNome() +
                ", estado civil: " + this.getEstadoCivil() +
                ", sigla de estado civil: " + this.getEstadoCivil().getSigla();
    }

    public String getNome() {
        return nome;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
}
