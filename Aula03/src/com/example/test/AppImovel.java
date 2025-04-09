package com.example.test;

import com.example.java.Imovel;
import com.example.java.Proprietario;

public class AppImovel {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Elton Kasesky");
        Proprietario p2 = new Proprietario("Inajara Giglio");

        Imovel i1 = new Imovel("Casa", 500000.0, p1);
        Imovel i2 = new Imovel("Apartamento", 270000.0, p2);

        System.out.println(i1);
        System.out.println(i2);
    }
}