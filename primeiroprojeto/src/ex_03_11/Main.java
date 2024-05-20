package ex_03_11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tentativas = 1;
        int numeroSorteado;
        int numeroEscolhido;
        boolean acertou = false;
        Scanner scanner = new Scanner(System.in);

        numeroSorteado = new Random().nextInt(101);

        while (tentativas <= 5) {
            System.out.print("Escolha um número: ");
            numeroEscolhido = scanner.nextInt();

            if (numeroEscolhido == numeroSorteado) {
                acertou = true;
                break;
            } else if (numeroEscolhido > numeroSorteado) {
                System.out.println("O número é menor!");
            } else {
                System.out.println("O número é maior!");
            }

            tentativas++;
        }

        if (acertou) {
            System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
        } else {
            System.out.println("Que pena! O número era " + numeroSorteado + ".");
        }

        scanner.close();
    }
}
