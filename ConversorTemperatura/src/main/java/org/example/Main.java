package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double temp_celcius = scanner.nextDouble();

        double temp_fahrenheit = (temp_celcius * 1.8) + 32;

        System.out.println("Em Fahrenheit = " + temp_fahrenheit + " Graus");
    }
}