package com.example.interfacejava.exception;

public class ContaCorrenteException extends RuntimeException {
    public ContaCorrenteException(String message) {
        super(message);
    }
}