package com.example.revisao2.java;

public abstract class Auxiliar extends Funcionario{
    protected String categoria;

    public Auxiliar(String nome, String cpf, Double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String toString() {
        return super.toString() + ", categoria: " + categoria;
    }
}