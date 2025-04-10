package com.example.java;

public class Policial {
    protected String nome;
    protected final String LOTACAO;

    public Policial(String nome, String LOTACAO) {
        this.nome = nome;
        this.LOTACAO = LOTACAO;
    }

    public String getNome() {
        return nome;
    }

    public String getLOTACAO() {
        return LOTACAO;
    }

    public final void imprimir(){
        System.out.println("Dados do policial " + this.getNome() + " Lotacao: " + this.getLOTACAO());
    }
}