package com.example.test;

public class AppDivisao {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(10, 0));
        } catch (ArithmeticException e){
            System.out.println("Impossivel dividir por 0 (zero)");
            e.printStackTrace();
        } finally {
            System.out.println("Finalizando o programa...");
        }
    }

    static int divisao(int a, int b) throws ArithmeticException {
        /*if(b == 0){
            throw new ArithmeticException("Impossivel dividir por 0 (zero)");
        }
        return a/b;*/
        return a / b;
    }
}