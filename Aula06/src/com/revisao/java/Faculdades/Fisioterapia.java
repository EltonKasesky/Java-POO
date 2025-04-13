package com.revisao.java.Faculdades;

import com.revisao.java.Faculdade;
import com.revisao.java.interfaces.Eventos;

public final class Fisioterapia extends Faculdade implements Eventos {
    public Fisioterapia(String nome, String nomeFaculdade, Integer bloco) {
        super(nome, nomeFaculdade, bloco);
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