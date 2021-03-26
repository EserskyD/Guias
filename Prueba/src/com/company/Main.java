package com.company;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
            Scanner nuevoScanner = new Scanner(System.in);
            Scanner intScanner = new Scanner(System.in);
            int varInt = 2, varX = 3, varY = 4, numero;
            double varDou = 1.2584, varM = 1.101010, varN = 1.202020;
            String varChar = "H" ,nombre;
            System.out.println(varInt);
            System.out.println(varDou);
            System.out.println(varChar);

            System.out.println(varX + "+" + varY + "=" + (varX+varY));
            System.out.println(varM + "+" + varN + " = " + (varM+varN));

            System.out.print(varInt + "+77=");
            varInt = (varInt + 77);
            System.out.println(varInt);
            System.out.print(varInt + "-3=");
            varInt = (varInt - 3);
            System.out.println(varInt);
            System.out.print(varInt + "*2=");
            varInt = (varInt * 2);
            System.out.println(varInt);

            System.out.println("Ingrese un nombre: ");
            nombre = nuevoScanner.nextLine();
            System.out.println("Buenos días " + nombre);
            System.out.println("Ingrese un número: ");
            numero = intScanner.nextInt();
            if ((numero % 2) == 1)
            {
                    System.out.println("El numero es impar");
            } else if((numero % 2) == 0)
            {
                    System.out.println("El numero es par");
            }

    }
}
