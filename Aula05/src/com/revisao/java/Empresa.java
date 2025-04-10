package com.revisao.java;

import com.revisao.java.interfaces.Tributos;

public class Empresa implements Tributos {
    private String razaoSocial;
    private Double rendimentos;

    public Empresa(String razaoSocial, Double rendimentos) {
        this.razaoSocial = razaoSocial;
        this.rendimentos = rendimentos;
    }

    @Override
    public String toString() {
        return "Empresa " +
                ", razaoSocial: " + this.getRazaoSocial() +
                ", rendimentos: R$" + this.getRendimentos() +
                ", Total de IR a pagar: R$" + this.calcularIR() +
                ", Total de ICMS a pagar: R$" + this.calcularICMS();
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public Double getRendimentos() {
        return rendimentos;
    }

    @Override
    public Double calcularICMS() {
        return rendimentos * ICMS;
    }

    @Override
    public Double calcularIR() {
        return rendimentos * IRPESSOAJURIDICA;
    }
}
