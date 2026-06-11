package org.example;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Atividade 1
        System.out.println("Atividade 1: Digite um valor: ");
        double a = teclado.nextByte();
        if (a > 0){
            System.out.println("Valor é Positivo!");
        }
        else if (a < 0) {
            System.out.println("Valor é Negativo!");
        }
        else {
            System.out.println("Valor é nulo!");
        }
        System.out.println("---");

        //Atividade 2
        System.out.println("Atividade 2: Digite 2 valores inteiros");
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        if(b-c > 0){
            System.out.println("primeiro é maior");
        }
        else if (b-c < 0) {
            System.out.println("segundo é maior");
        }
        else{
            System.out.println("valores iguais!");
        }
        System.out.println("---");

        //atividade 3
        int d;
        System.out.println("Atividade 3");
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - calcular area quadrado");
            System.out.println("2 - calcular area circulo");
            d = teclado.nextInt();
            if (d != 1 && d != 2) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        } while (d != 1 && d != 2);

        if (d == 1){
            System.out.println("Digite o comprimeto do lado do quadrado em cm: ");
            double lq = teclado.nextByte();
            double aq = lq * lq;
            System.out.println("Area quadrado: "+aq);
        }
        else {
            System.out.println("Digite o raio do circulo em cm: ");
            double r = teclado.nextByte();
            double ac = 3.14 * (r*r);
            System.out.println("Area Circulo: "+ac);
        }
        System.out.println(" ");

        //Atividade 4
        System.out.println("Atividade 4");
        System.out.println("Digite o numero que deseja ver a tabuade do 1 ao 10: ");
        int e = teclado.nextInt();

        for (int i = 1; i<11; i++){
            System.out.println(e +"x"+ i +" = "+ e*i);
        }
        System.out.println(" ");

        //Atividade 5
        System.out.println("Atividade 5");
        System.out.println("Digite um numero inteiro: ");
        int g = teclado.nextInt();

        if (g%2 == 0){
            System.out.println("Número é par");
        }
        else {
            System.out.println("Número é impar");
        }

        System.out.println(" ");

        //Atividade 6
        System.out.println("Atividade 6");
        System.out.println("Digite o numero que deseja ver o fatorial: ");
        int f = teclado.nextInt();

        int fat = 1;
        for (int i = f; i > 0; i--) {
            fat = fat * i;
        }

        System.out.println("Fatorial de " + f + " = " + fat);






    }
}