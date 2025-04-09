package com.example.java;

public class Pediatra extends Medico {
    private String especialiazacao;

    public Pediatra(String crm, String nome, Double salario, String especialiazacao) {
        super(crm, nome, salario);
        this.especialiazacao = especialiazacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialiazação: " + getEspecialiazacao();
    }

    public String getEspecialiazacao() {
        return especialiazacao;
    }

    @Override
    public Double calcularSalario() {
        return salario += salario * 1.15;
    }

    //Overload
    public Double calcularSalario(Double valor) {
        return salario += salario * (valor / 100);
    }
}
