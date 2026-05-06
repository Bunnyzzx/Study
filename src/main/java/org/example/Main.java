/*
Exercício: Verificador de Número Positivo, Negativo ou Zero

Crie um programa em Java que:

1 Peça para o usuário digitar um número
2 Verifique se o número é:
    positivo
    negativo
    ou zero
3 Mostre o resultado na tela
 */

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = teclado.nextInt();

        if (num > 0) {
            System.out.println("Positivo");
        }

        else if (num <0) {
            System.out.println("Negativo");
        }

        else {
            System.out.println("Zero");
        }


    }
}
