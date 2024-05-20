package ex_02_14;

public class Ex04 {
    public static void main(String[] args) {
        double precoProduto = 3.90;
        int quantidade = 3;
        double total = precoProduto * quantidade;

        System.out.println("%s produtos por R$%.2f = R$%.2f.".formatted(quantidade,precoProduto,total));
    }
}
