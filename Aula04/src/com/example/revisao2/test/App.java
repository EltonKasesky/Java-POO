package com.example.revisao2.test;

import com.example.revisao2.java.*;

public class App {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Inajara Eiras", "321.654.987-00", 5000.0, "Gerente Geral");
        Assistente a1 = new Assistente("Elton Kasesky", "123.456.789-00", 2700.0, 300.0);
        AssistenteProducao ap1 = new AssistenteProducao("Elton Kasesky", "123.456.789-00", 2700.0, 300.0, 1000);
    }
}