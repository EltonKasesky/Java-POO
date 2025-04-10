package com.example.test;

import com.example.java.EstadoCivil;
import com.example.java.Pessoa;

public class AppEstadoCivil {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Elton Kasesky", EstadoCivil.CASADO);

        System.out.println(p);
        System.out.println("Indice do enum: " + p.getEstadoCivil().ordinal());

        //Percorrer valores do enum
        System.out.println("\nValores existentes no enum: ");
        for(EstadoCivil ec : EstadoCivil.values()){
            System.out.println(ec + " (" + ec.getSigla() + ")");
        }
    }
}