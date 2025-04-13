package com.revisao.java;

public abstract class ColegioAplicacao extends Universidade {
    protected String nomeCoordenador;

    public ColegioAplicacao(String nome, String nomeCoordenador) {
        super(nome);
        this.nomeCoordenador = nomeCoordenador;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "ColegioAplicacao" +
                ", nomeCoordenador: " + this.getNomeCoordenador();
    }

    public String getNomeCoordenador() {
        return nomeCoordenador;
    }

    public abstract void reuniaoDePais();
}
