package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vida = 5;
        int numeroDigitado = 0;
        int numerorandom = GeradorNumero.gerarNumero();

        System.out.println("Bem vindo ao jogo!");
        System.out.println("Tente advinhar o valor de 0-100!");
        System.out.println("Você tem 5 chances/vidas!");
        System.out.println(" ");

        for (int i = 0; i<5; i++){
            System.out.println("Digite um valor! Você ainda tem "+vida+" vidas!");
            numeroDigitado = teclado.nextInt();
            System.out.println(" ");
            vida = vida-1;

            if (numeroDigitado == numerorandom){
                System.out.println("Você acertou! Número escolhido era: "+numerorandom+"!");
            }
            else{
                System.out.println("Você errou! Perdeu uma vida!");
                if (numerorandom > numeroDigitado){
                    System.out.println("O numero é Maior que "+numeroDigitado);
                    System.out.println(" ");
                }
                else{
                    System.out.println("O numero é Menor que "+numeroDigitado);
                    System.out.println(" ");
                }
            }
        }
        if (vida == 0){
            System.out.println("Você perdeu o jogo! Suas vidas acabaram!");
            System.out.println("Tente novamente!");
        }
        else{
            System.out.println("Você Ganhou o jogo! Você ainda tinha "+vida+"Vidas!");
        }


    }
}