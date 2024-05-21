package ex_03_13;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Números iguais!");
        } else if (numero1 > numero2) {
            System.out.println("Números diferentes. %d é maior que %d".formatted(numero1,numero2));
        } else {
            System.out.println("Números diferentes. %d é maior que %d".formatted(numero2,numero1));
        }
    }
}
