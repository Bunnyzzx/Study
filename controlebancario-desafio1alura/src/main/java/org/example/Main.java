package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente usuario = new Cliente("Caio", "Corrente", 1000);

        Scanner teclado = new Scanner(System.in);

        int opcao = 0;

        for (; opcao != 4; ) {

            System.out.println("\n***********");
            System.out.println("Operações:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Transferência");
            System.out.println("4 - Sair");
            System.out.println("***********");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Saldo atual: R$ " + usuario.getSaldo());
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = teclado.nextDouble();
                    usuario.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite o valor da transferência: R$ ");
                    double transferencia = teclado.nextDouble();
                    usuario.transferir(transferencia);
                    System.out.println("Transferência realizada!");
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        teclado.close();
    }
}