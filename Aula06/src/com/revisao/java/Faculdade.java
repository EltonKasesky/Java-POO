package com.revisao.java;

public abstract class Faculdade extends Universidade{
    protected String nomeFaculdade;
    protected Integer bloco;

    public Faculdade(String nome, String nomeFaculdade, Integer bloco) {
        super(nome);
        this.nomeFaculdade = nomeFaculdade;
        this.bloco = bloco;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Faculdade" +
                ", nomeFaculdade: " + nomeFaculdade +
                ", bloco: " + bloco;
    }

    public abstract String matrizCurricular();
}
