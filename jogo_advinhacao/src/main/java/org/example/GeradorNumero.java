package org.example;
import java.util.Random;

public class GeradorNumero {
    public static int gerarNumero() {
        return new Random().nextInt(100) + 1;
    }
}