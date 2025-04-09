package com.example.revisao.test;

import com.example.revisao.java.Casa;
import com.example.revisao.java.Proprietario;

public class App {
    public static void main(String[] args){
        Proprietario p1 = new Proprietario("Elton Kasesky");
        Casa c1 = new Casa("Alto da Serra", 150000.0, p1, true);

        System.out.println(c1);
        System.out.println("Valor do ITBI: R$" + Math.round(c1.calcularITBI()));
    }
}