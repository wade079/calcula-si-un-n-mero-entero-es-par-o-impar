package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner numero = new Scanner(System.in);
        int numero_valor;
        System.out.println("introduzca numero entero");

        numero_valor = numero.nextInt();

        if (numero_valor % 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
    }
}
