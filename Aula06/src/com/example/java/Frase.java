package com.example.java;

import com.example.java.exception.FraseException;

import java.util.InputMismatchException;

public class Frase {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if (texto == null) {
            throw new FraseException("Impossível capitalizar um texto nulo");
        } else {
            this.texto = texto.toUpperCase();
        }
    }
}