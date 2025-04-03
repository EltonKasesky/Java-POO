package revisao;

public class Funcionario {
    private String nome;
    private float salario;
    private static int contador = 0; //Pertence a classe

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
        contador++;
    }

    public String getNome() {
        return nome;
    }


    public float getSalario() {
        return salario;
    }

    public static int getContador(){
        return contador;
    }
}
