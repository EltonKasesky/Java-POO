package com.example.revisao2.java;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected Double salario;

    public Funcionario(String nome, String cpf, Double salario) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario " +
                "nome: " + nome + '\'' +
                ", cpf: " + cpf + '\'' +
                ", salario: " + salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public abstract void reajusteSalarial(Double valor);
}