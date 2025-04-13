package com.revisao.java.Colegios;

import com.revisao.java.ColegioAplicacao;

public class TecnicoConcomitante extends ColegioAplicacao {
    private String nomeCurso;

    public TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
        super(nome, nomeCoordenador);
        this.nomeCurso = nomeCurso;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Tecnico Concomitante" +
                ", nome do curso: " + this.getNomeCurso();
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    @Override
    public void reuniaoDePais() {

    }

    @Override
    public void fazerMatricula() {

    }
}
