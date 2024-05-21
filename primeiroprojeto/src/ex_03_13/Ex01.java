package ex_03_13;

import java.util.Scanner;

//1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo!");
        }
    }
}
