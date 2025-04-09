package com.example.revisao2.java;

public class AuxiliarAdm extends Auxiliar {
    public AuxiliarAdm(String nome, String cpf, Double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void reajusteSalarial(Double valor) {
        this.salario += salario * (valor / 100);
    }
}