package com.revisao.java;

public abstract class Universidade {
    protected String nome;

    public Universidade(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Universidade" +
                ", nome: " + this.getNome();
    }

    public String getNome() {
        return nome;
    }

    public abstract void fazerMatricula();
}
