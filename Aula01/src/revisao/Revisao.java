package revisao;

public class Revisao {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Elton Kasesky", 69.3, 1.75);

        System.out.println(p1.resultadoIMC());
    }
}