package ex_03_13;

import java.util.Scanner;

//4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para exibir sua tabuada: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println("%d x %d = %d".formatted(numero, i, numero * i));
        }
    }
}
