package ex_03_13;

import java.util.Scanner;

//3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1-Calcular área do quadrado.");
        System.out.println("2-Calcular área do círculo.");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                areaQuadrado();
                break;
            case 2:
                areaCirculo();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void areaQuadrado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Medida do lado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;

        System.out.println("Área do quadrado: %.2f!".formatted(area));
    }

    private static void areaCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Medida do raio: ");
        double raio = scanner.nextDouble();
        double area = 2 * Math.PI * raio;

        System.out.println("Área do círculo: %.2f!".formatted(area));
    }
}
