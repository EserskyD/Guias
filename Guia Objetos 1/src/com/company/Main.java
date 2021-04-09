package com.company;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner nuevoScanner = new Scanner(System.in);
        Formatter form = new Formatter();
        int opciones;

        do {
            nuevoScanner.reset();
            System.out.println("1. Objeto Rectangulo");
            System.out.println("2. Objeto Empleado");
            System.out.println("3. Objeto Item de venta");
            System.out.println("4. Objeto Cuenta bancaria");
            System.out.println("5. Objeto hora");
            System.out.println("0. Salir");
            System.out.println("Elija el ejercicio a realizar: ");
            opciones = nuevoScanner.nextInt();

            switch (opciones) {

                case 1:
                System.out.println("");
                obj_Rectangulo rectangulo = new obj_Rectangulo();
                rectangulo.setAlto(5);
                rectangulo.setAncho(10);

                rectangulo.imprimirAltoAncho();

                System.out.println("El area del rectangulo es: " + rectangulo.rectanguloArea());
                System.out.println("El perimetro del rectangulo es: " + rectangulo.rectanguloPerimetro());

                System.out.println("Ingrese el nuevo alto: ");
                rectangulo.setAlto(nuevoScanner.nextDouble());
                nuevoScanner.reset();
                System.out.println("Ingrese el nuevo ancho: ");
                rectangulo.setAncho(nuevoScanner.nextDouble());

                rectangulo.imprimirAltoAncho();
                System.out.println("La nueva area del rectangulo es: " + rectangulo.rectanguloArea());
                System.out.println("El nuevo perimetro del rectangulo es: " + rectangulo.rectanguloPerimetro());
                System.out.println("");
                break;

                case 2:
                    System.out.println("");
                    obj_Empleado carlos = new obj_Empleado();
                    obj_Empleado ana = new obj_Empleado();

                    carlos.setDni(23456345);
                    carlos.setNombre("Carlos");
                    carlos.setApellido("Gutiérrez");
                    carlos.setSalario(25000);

                    ana.setDni(34234123);
                    ana.setNombre("Ana");
                    ana.setApellido("Sánchez");
                    ana.setSalario(27500);

                    carlos.imprimirEmpleado();
                    ana.imprimirEmpleado();

                    carlos.aumentarSalario(15);

                    carlos.imprimirEmpleado();
                    System.out.println("El salario anual del empleado "+carlos.nombre + " " + carlos.apellido + " es de: " + carlos.calcularSalarioAnual());
                    System.out.println("");
                break;

                case 3:
                    System.out.println("");
                    obj_itemVentas item = new obj_itemVentas();
                    item.setId(0001);
                    item.setDescripción("Lampara");
                    item.setCantidad(20);
                    item.setpUnitario(500);
                    item.setpTotal(item.calculoPTotal());

                    item.imprimirItem();

                    System.out.println("");

                break;

                case 4:
                    obj_cuentaBancaria cuenta = new obj_cuentaBancaria();
                    cuenta.setId(1);
                    cuenta.setNombre("Carlos");
                    cuenta.setBalance(15000);

                    cuenta.credito(2500);
                    cuenta.debito(1500);
                    cuenta.debito(30000);
                    if (cuenta.getBalance()<0)
                    {
                        System.out.println("Su cuenta esta en negativo");
                    } else
                    {
                        cuenta.imprimirCuenta();
                    }

                break;

                case 5:

                break;

                default:
                break;
            }

        } while (opciones != 0);
    }
}
