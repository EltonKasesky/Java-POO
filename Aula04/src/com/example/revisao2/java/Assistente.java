package com.example.revisao2.java;

public class Assistente extends Funcionario{
    protected Double adicional;

    public Assistente(String nome, String cpf, Double salario, Double adicional) {
        super(nome, cpf, salario);
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return super.toString() + ", Adicional: R$" + adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    @Override
    public void reajusteSalarial(Double valor) {
        this.salario += salario * (valor/100) + adicional;
    }
}