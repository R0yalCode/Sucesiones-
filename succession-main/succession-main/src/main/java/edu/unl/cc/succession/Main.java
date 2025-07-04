package edu.unl.cc.succession;

import edu.unl.cc.succession.business.EvenNumberCalculatorUpToLimit;
import edu.unl.cc.succession.business.PrimeCubedCalculatorUpToLimit;
import edu.unl.cc.succession.domain.Successionable;

import java.util.Scanner;

public class Main {

    private int readOptionsMenu(Scanner sc) {
        int opcion;
        System.out.println("Integrantes");
        System.out.println("* GYNA MAYERLY YUPANQUI ROMERO");
        System.out.println("* ROYEL IVÁN JIMA PARDO");
        System.out.println("* DAVID ALEJANDRO RUIZ SANCHEZ");
        System.out.println("* GALO MILTON BENITEZ CABRERA");
        System.out.println("* DARWIN JOSE CORREA SARITAMA");
        System.out.println("Elija la opción de la serie que desea calcular:");
        System.out.println("1. Serie de numeros pares hasta un limite (S = 2 + 4 + 6 + 8 + ... N): ");
        System.out.println("2. Serie de primos elevados al cubo  hasta un limite (S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3 ... + N^3): ");
        System.out.println("3. Serie de primos elevados al cubo  hasta N términos (S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3 ...): ");
        System.out.println("4. Serie de primos elevados por pares hasta un limite (S = 1^2 + 3^4 + 5^6 + 7^8 + 11^10 + 13^(12) ... + N): ");
        System.out.println("5. Serie de primos elevados a impares hasta n térmimos (S = S = 1^1 + 3^3 + 5^5 + 7^7 + 11^9 + 13^11 ..): ");
        System.out.println("6. Serie de primos elevados a la raiz de numeros pares hasta un limite (S = 1^(1/2) + 3^(1/4) + 5^(1/6) + 7^(1/8) + 11^(1/10) + 13^(1/12) ... + N): ");
        System.out.println("7. Serie de primos elevados a la raiz de numeros impares hasta un n términos (S = 1^(1/1) + 3^(1/3) + 5^(1/5) + 7^(1/7) + 11^(1/9) + 13^(1/11)): ");
        System.out.println("8. Serie de primos elevados a la raiz cúbica hasta un n términos (S = 1^(1/3) + 3^(1/3) + 5^(1/3) + 7^(1/3) + 11^(1/3) + 13^(1/3)): ");
        System.out.println("9. Serie de primos elevados a la raiz cuadrada hasta un limite (S = 1^(1/2) + 3^(1/2) + 5^(1/2) + 7^(1/2) + 11^(1/2) + 13^(1/2)+ .. + N^(1/2): ");
        opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main programa = new Main();

        int opcion = programa.readOptionsMenu(sc);
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el limite N: ");
                int limitePares = sc.nextInt();
                Successionable sucesionPares = new EvenNumberCalculatorUpToLimit(limitePares);
                Number resultadoPares = sucesionPares.calculate();
                System.out.println(sucesionPares.print());
                System.out.println("Resultado: " + resultadoPares);
                break;
            case 2:
                System.out.print("Ingrese el limite N: ");
                int limitePrimos = sc.nextInt();
                Successionable sucesionPrimos = new PrimeCubedCalculatorUpToLimit(limitePrimos);
                Number resultadoPrimos = sucesionPrimos.calculate();
                System.out.println(sucesionPrimos.print());
                System.out.println("Resultado: " + resultadoPrimos);
                break;
            default:
                System.out.println("Opción no soportada todavia.");
        }
        sc.close();
    }
}