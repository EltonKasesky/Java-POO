package com.revisao.java.Faculdades;

import com.revisao.java.Faculdade;
import com.revisao.java.interfaces.Eventos;
import com.revisao.java.interfaces.Oab;

public final class Direito extends Faculdade implements Oab, Eventos {
    private Integer tempoDuracao;

    public Direito(String nome, String nomeFaculdade, Integer bloco, Integer tempoDuracao) {
        super(nome, nomeFaculdade, bloco);
        this.tempoDuracao = tempoDuracao;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Direito " +
                ", tempoDuracao: " + this.getTempoDuracao();
    }

    public Integer getTempoDuracao() {
        return tempoDuracao;
    }

    @Override
    public Boolean realizarProva() {
        return null;
    }

    @Override
    public String matrizCurricular() {
        return "";
    }

    @Override
    public void fazerMatricula() {

    }

    @Override
    public String programacao() {
        return "";
    }

    @Override
    public void conteudoEventos() {

    }
}