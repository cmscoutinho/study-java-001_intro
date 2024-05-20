package ex_02_14;

public class Ex05 {
    public static void main(String[] args) {
        double valorEmDolares = 14.90;
        double valorEmReais = valorEmDolares * 4.94;

        System.out.println("US$%.2f = R$%.2f.".formatted(valorEmDolares,valorEmReais));
    }
}
