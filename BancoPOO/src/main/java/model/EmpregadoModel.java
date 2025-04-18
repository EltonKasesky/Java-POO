package model;

public class EmpregadoModel {
    private Integer id;
    private String nome;
    private String profissao;
    private Double salario;

    public EmpregadoModel(String nome, String profissao, Double salario) {
        this.nome = nome;
        this.profissao = profissao;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado [nome=" + this.getNome() + ", profissao=" + this.getProfissao() + ", salario=" + this.getProfissao() + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public Double getSalario() {
        return salario;
    }
}
