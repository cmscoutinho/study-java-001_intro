package desafio_04_02;

import java.util.Scanner;

public class Main {

    enum TipoConta {
        Corrente,
        Poupança,
        Salário
    }

    public static void main(String[] args) {
        String nomeCliente = "Claudio Coutinho";
        TipoConta tipoConta = TipoConta.Corrente;
        double saldo = 2500.0;

        Scanner scanner = new Scanner(System.in);
        int opcao;

        exibeMsgInicial(nomeCliente, tipoConta, saldo);
        do{
            exibeMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   consulta(saldo);
                   break;
                case 2:
                    saldo = receber(saldo);
                    break;
                case 3:
                    saldo = transferir(saldo);
                    break;
                case 4:
                    sair(nomeCliente);
                    break;
                default:
                    erro();
            }
        } while (opcao != 4);
    }

    private static void exibeMsgInicial(String nomeCliente, TipoConta tipoConta, double saldoInicial) {
        System.out.println("""
        **************************************
        Dados iniciais do cliente:
        
        Nome:\t\t\t%s".formatted(nomeCliente));
        Tipo conta:\t\t%s".formatted(tipoConta));
        Saldo inicial: \tR$ %.2f".formatted(saldoInicial));
        **************************************""");
    }

    private static void exibeMenu() {
        System.out.println("""
        Operações:
        
        1- Consultar saldo
        2- Receber valor
        3- Transferir valor
        4- Sair
        
        Digite a opção desejada: """);
    }

    private static void consulta(double saldo) {
        System.out.println("O saldo atual é R$ %.2f".formatted(saldo));
    }

    private static double receber(double saldo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: ");
        return saldo + scanner.nextDouble();
    }

    private static double transferir(double saldo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da transferência: ");
        double transferencia = scanner.nextDouble();

        if (transferencia > saldo) {
            System.out.println("O valor da transferência não pode exceder o saldo!");
            return saldo;
        } else {
            return saldo - transferencia;
        }
    }

    private static void sair(String nomeCliente) {
        System.out.println("%s, obrigado por utilizar nosso banco!".formatted(nomeCliente));
    }

    private static void erro() {
        System.out.println("Opção inválida! Tente novamente");
    }
}
