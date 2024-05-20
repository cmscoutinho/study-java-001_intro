package ex_02_14;

public class Ex06 {
    public static void main(String[] args) {
        double precoOriginal = 22.45;
        double percentualDesconto = 15;
        double valorFinal = precoOriginal*(1-percentualDesconto/100);

        System.out.println("Desconto de %.2f%% sobre R$%.2f. Total: R$%.2f.".formatted(percentualDesconto, precoOriginal, valorFinal));
    }
}
