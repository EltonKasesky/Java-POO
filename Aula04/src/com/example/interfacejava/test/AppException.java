package com.example.interfacejava.test;

import com.example.interfacejava.java.ContaCorrente;

public class AppException {
    public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente("Elton Kasesky", 5000.0);
    cc.investimento(1000.0);
    }
}
