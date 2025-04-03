package revisao;

public class TesteProduto {
    public static void main(String[] args){
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.setCodigo(1);
        p1.setDescricao("TV");
        p1.setValor(1500);

        System.out.println(p1.getDescricao() + "\n" + p1.getValor());
    }
}
