package ex_03_13;

import java.util.Scanner;

//6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int produto = 1;
        for (int i = numero; i > 0; i--) {
            produto *= i;
        }

        System.out.println("O fatorial de %d é %d!".formatted(numero,produto));
    }
}
