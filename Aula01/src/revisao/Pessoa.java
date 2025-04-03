package revisao;

public class Pessoa {
    private int id;
    private String nome;
    private double peso, altura;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Pessoa(int id, String nome, double peso, double altura) {
        this.setId(id);
        this.setNome(nome);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    private double calcularIMC(){
        return this.getPeso() / (this.getAltura() * this.getAltura());
    }

    public String resultadoIMC(){
        if(this.calcularIMC() <= 18.5){
            return "Abaixo do peso";
        } else if (this.calcularIMC() <= 24.9) {
            return "Peso ideal";
        } else {
            return "Acima do peso";
        }
    }
}
