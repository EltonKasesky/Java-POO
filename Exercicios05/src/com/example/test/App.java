package com.example.test;

import com.example.java.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Deise");
        Proprietario p2 = new Proprietario("Leorick");

        Carro c = new Carro("Fusca", LocalDate.of(2025, 8, 3), p2, "Popular");
        Moto m = new Moto("Biz", LocalDate.of(2025, 1, 20), p1, 120);

        c.trocarOleo();
        c.revisao();
        System.out.println(c);

        m.trocarOleo();
        m.revisao();
        m.lavarVeiculo();
        System.out.println(m);
    }
}