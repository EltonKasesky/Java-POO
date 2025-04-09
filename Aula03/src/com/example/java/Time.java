package com.example.java;

import java.util.Arrays;
import java.util.Scanner;

public class Time {
    private String nome;
    private String tecnico;
    private Atleta[] atletas;

    public Time(String nome, String tecnico, Atleta[] atletas) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = atletas;
    }

    @Override
    public String toString() {
        return "Time " +
                "nome: " + getNome() + '\'' +
                ", tecnico: " + getTecnico() + '\'' +
                ", atletas: " + Arrays.toString(getAtletas());
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public Atleta[] getAtletas() {
        return atletas;
    }

    public void adicionarAtleta(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < atletas.length; i++){
            System.out.println("Digite o nome do atleta: ");
            String nome = sc.next();

            System.out.println("Digite a idade do atleta: ");
            Integer idade = sc.nextInt();

            atletas[i] = new Atleta(nome, idade);
        }
    }

    public void exibirElenco(){
        for(Atleta atleta: atletas){
            if(!atleta.getNome().isEmpty()){
                System.out.println(atleta);
            }
        }
    }
}