package com.revisao.java;

import com.revisao.java.interfaces.Tributos;

public class Pessoa implements Tributos {
    private String nome;
    private Double rendimentos;

    public Pessoa(String nome, Double rendimentos) {
        this.nome = nome;
        this.rendimentos = rendimentos;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                ", nome: " + this.getNome() +
                ", rendimentos: R$" + this.getRendimentos() +
                ", Total de IR a pagar: R$" + this.calcularIR();
    }

    public String getNome() {
        return nome;
    }

    public Double getRendimentos() {
        return rendimentos;
    }

    @Override
    public Double calcularICMS() {
        return 0.0;
    }

    @Override
    public Double calcularIR() {
        return rendimentos * IRPESSOAFISICA;
    }
}
