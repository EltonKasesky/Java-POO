package com.example.interfacejava.java;

import com.example.interfacejava.exception.ContaCorrenteException;

public class ContaCorrente implements Conta {
    private String titular;
    private Double saldo;
    private Integer saques = 0, depositos = 0;

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente" +
                ", titular: " + this.getTitular() +
                ", saldo: R$" + this.getSaldo() +
                ", depositos: " + this.getDepositos() +
                ", saques: " + this.getSaques() +
                ", total operações: " + (this.getDepositos() + this.getSaques());
    }

    public String getTitular() {
        return this.titular;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public Integer getSaques() {
        return this.saques;
    }

    public Integer getDepositos() {
        return this.depositos;
    }

    @Override
    public Boolean saque(Double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            this.saques++;
            return true;
        }
        //Exceção vista na aula 6
        throw new ContaCorrenteException("Saldo insuficiente!");
    }

    @Override
    public void deposito(Double valor) {
        if(valor > 0){
            this.saldo += valor;
            this.depositos++;
        } else {
            throw new ContaCorrenteException("O deposito deve ser maior que 0 (zero)!");
        }
    }

    public void investimento(Double valor) throws ContaCorrenteException {
        this.setSaldo(this.getSaldo() - valor);
    }
}