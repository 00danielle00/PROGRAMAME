package org.example;

import java.util.Scanner;

public class Problema1 {
    static java.util.Scanner teclado;

    public static void casoDePrueba() {
        String soy = teclado.next();
        String nombre = teclado.next();

        System.out.println("Hola, "+ nombre+".");
    }

    public static void main(String[] args) {

        teclado = new java.util.Scanner(System.in);
        int numCasos = teclado.nextInt();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }
}
