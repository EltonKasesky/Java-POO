package com.example.interfacejava.test;

import com.example.interfacejava.exception.ContaCorrenteException;
import com.example.interfacejava.java.ContaCorrente;

public class App {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Elton Kasesky", 5000.0);
        ContaCorrente cc2 = new ContaCorrente("Ana Julia", 7000.0);

        /*cc1.deposito(500.0);
        cc1.deposito(500.0);
        cc1.saque(10000.0);

        cc2.deposito(200.0);
        cc2.saque(500.0);

        System.out.println(cc1);
        System.out.println(cc2);*/

        try {
            cc1.deposito(-1.0);
            System.out.println(cc1);
        } catch (ContaCorrenteException e) {
            System.out.println(e.getMessage());
            /* e.printStackTrace(); */ //Pilha de erros
        } finally {
            System.out.println("Saldo: R$" + cc1.getSaldo());
        }
    }
}
