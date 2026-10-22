
package com.zubirimanteo.devops;

import java.util.Scanner;

public class CalculadoraConsola {

    private final Calculadora calculadora = new Calculadora();
    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcion;

        System.out.println("=== CALCULADORA ===");

        do {
            System.out.println("\n1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Introduce una opción válida.");
                scanner.next();
                System.out.print("Elige una opción: ");
            }

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Introduce el primer número: ");
                int a = leerNumero();

                System.out.print("Introduce el segundo número: ");
                int b = leerNumero();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: "
                                + calculadora.suma(a, b));
                        break;

                    case 2:
                        System.out.println("Resultado: "
                                + calculadora.resta(a, b));
                        break;

                    case 3:
                        System.out.println("Resultado: "
                                + calculadora.multiplicacion(a, b));
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }


        } while (opcion != 0);

        System.out.println("Calculadora cerrada.");
    }

    private int leerNumero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Debes introducir un número entero.");
            scanner.next();
            System.out.print("Inténtalo de nuevo: ");
        }
        
        return scanner.nextInt();
    }
}
