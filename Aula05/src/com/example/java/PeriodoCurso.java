package com.example.java;

public enum PeriodoCurso {
    INTEGRAL("Terça e quinta",40,2000.0),
    NOTURNO("Sexta",80,3000.0),
    TARDE("Segunda e Quarta",20,500.0);

    private String dias;
    private Integer cargaHoraria;
    private Double valor;

    PeriodoCurso(String dias, Integer cargaHoraria, Double valor) {
        this.dias = dias;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }

    public String getDias() {
        return dias;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public Double getValor() {
        return valor;
    }
}
