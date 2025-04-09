package com.example.revisao2.java;

public class Gerente extends Funcionario{
    private String nivel;

    public Gerente(String nome, String cpf, Double salario, String nivel) {
        super(nome, cpf, salario);
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + ", nivel: " + nivel;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public void reajusteSalarial(Double valor) {
        this.salario += salario * (valor/100);
    }
}