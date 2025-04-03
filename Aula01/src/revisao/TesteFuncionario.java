package revisao;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Elton Kasesky", 5000);
        Funcionario f2 = new Funcionario("Ana Julia", 7000);

        System.out.println("Nome: " + f1.getNome() + " Salario: " + f1.getSalario());
        System.out.println("Nome: " + f2.getNome() + " Salario: " + f2.getSalario());
        System.out.println("Número de funcionarios: " + Funcionario.getContador());
    }
}
