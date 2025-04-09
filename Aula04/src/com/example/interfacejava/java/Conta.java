package com.example.interfacejava.java;

public interface Conta {
    //Public, static, final são redundantes e vem por padrão
    public static final Double TAXAS = 10.0;

    //Public, abstract são redundantes e vem por padrão
    public abstract Boolean saque(Double valor);
    public abstract void deposito(Double valor);
}