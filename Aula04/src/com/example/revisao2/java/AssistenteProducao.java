package com.example.revisao2.java;

public class AssistenteProducao extends Assistente {
    private Integer meta;

    public AssistenteProducao(String nome, String cpf, Double salario, Double adicional, Integer meta) {
        super(nome, cpf, salario, adicional);
        this.meta = meta;
    }

    @Override
    public String toString() {
        return super.toString() + ", meta: " + meta;
    }

    public Integer getMeta() {
        return meta;
    }
}