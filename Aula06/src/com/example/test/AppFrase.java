package com.example.test;

import com.example.java.Frase;
import java.util.Scanner;

public class AppFrase {
    public static void main(String[] args) {
        Frase frase = new Frase();
        Scanner sc = new Scanner(System.in);

        try {
            //frase.setTexto(null);
            //System.out.println("Texto inserido: " + frase.getTexto());

            System.out.println("Insira um número: ");
            int idade = sc.nextInt();

            if (idade < 0 || idade > 120) {
                throw new IllegalArgumentException("Insira uma idade valida!");
            }

            System.out.println(idade);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
