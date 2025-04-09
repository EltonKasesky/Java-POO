package com.example.test;

import com.example.java.Atleta;
import com.example.java.Time;

public class AppTime {
    public static void main(String[] args) {
        Time time = new Time("Vasco", "Carille", new Atleta[3]);

        time.adicionarAtleta();
        time.exibirElenco();

        System.out.println(time);
    }
}