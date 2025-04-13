package com.revisao.java.Colegios;

import com.revisao.java.ColegioAplicacao;

public final class EnsinoMedio extends ColegioAplicacao {
    private Integer numeroAlunos;

    public EnsinoMedio(String nome, String nomeCoordenador, Integer numeroAlunos) {
        super(nome, nomeCoordenador);
        this.numeroAlunos = numeroAlunos;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Ensino Medio" +
                ", numero de alunos: " + this.getNumeroAlunos();
    }

    public Integer getNumeroAlunos() {
        return numeroAlunos;
    }

    @Override
    public void reuniaoDePais() {

    }

    @Override
    public void fazerMatricula() {

    }
}
