package com.example.test;

import com.example.java.PeriodoCurso;
import com.example.java.Turma;

public class AppTurma {
    public static void main(String[] args) {
        Turma t = new Turma("Fullstack", PeriodoCurso.TARDE);

        System.out.println(t);
    }
}
