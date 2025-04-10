package com.example.java;

public class Turma {
    private String curso;
    private PeriodoCurso periodoCurso;

    public Turma(String curso, PeriodoCurso periodoCurso) {
        this.curso = curso;
        this.periodoCurso = periodoCurso;
    }

    @Override
    public String toString() {
        return "Turma" +
                ", curso: " + this.getCurso() + '\'' +
                ", Dias do curso: " + this.periodoCurso.getDias() +
                ", Carga horaria do curso: " + this.periodoCurso.getCargaHoraria() + " horas" +
                ", Valor do curso: R$" + this.periodoCurso.getValor();
    }

    public String getCurso() {
        return curso;
    }

    public PeriodoCurso getPeriodoCurso() {
        return periodoCurso;
    }
}
