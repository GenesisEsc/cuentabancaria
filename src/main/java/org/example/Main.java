package org.example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float saldo, tasaAhorros, cantidadDepositar, cantidadRetirar;
        int opcion = 0;

        while (opcion != 3) { // menú principal
            System.out.println("╔═════════════════════════════════╗");
            System.out.println("║        SISTEMA BANCARIO         ║");
            System.out.println("╚═════════════════════════════════╝");
            System.out.println("Seleccione su tipo de cuenta:");
            System.out.println("1. Ahorros");
            System.out.println("2. Corriente");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuenta Ahorros");
                    System.out.println("Ingrese el saldo inicial:");
                    saldo = Float.parseFloat(br.readLine());
                    System.out.println("Ingrese la tasa de interes anual:");
                    tasaAhorros = Float.parseFloat(br.readLine());
                    CuentaAhorro cuenta1 = new CuentaAhorro(saldo, tasaAhorros);

                    int opcionCuentaAhorro = 0;
                    while (opcionCuentaAhorro != 3) { // menú de transacciones de la cuenta de ahorro
                        System.out.println("┌──────────────────────────────────┐");
                        System.out.println("│Seleccione el tipo de transacción:│");
                        System.out.println("│ 1. Deposito                      │");
                        System.out.println("│ 2. Retiro                        │");
                        System.out.println("│ 3. Volver al menú principal      │");
                        System.out.println("└──────────────────────────────────┘");

                        opcionCuentaAhorro = sc.nextInt();

                        switch (opcionCuentaAhorro) {
                            case 1:
                                System.out.println("Ingrese la cantidad a depositar:");
                                cantidadDepositar = Float.parseFloat(br.readLine());
                                cuenta1.depositar(cantidadDepositar);
                                break;
                            case 2:
                                System.out.println("Ingrese la cantidad a retirar:");
                                cantidadRetirar = Float.parseFloat(br.readLine());
                                cuenta1.retirar(cantidadRetirar);
                                break;
                            case 3:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                        cuenta1.extractoMensual();
                        cuenta1.imprimir();
                    }
                    break;

                case 2:
                    System.out.println("Cuenta Corriente");
                    System.out.println("Ingrese el saldo inicial:");
                    saldo = Float.parseFloat(br.readLine());
                    System.out.println("Ingrese la tasa de interes anual:");
                    tasaAhorros = Float.parseFloat(br.readLine());
                    CuentaCorriente cuenta2 = new CuentaCorriente(saldo, tasaAhorros);

                    int opcionCuentaCorriente = 0;
                    while (opcionCuentaCorriente != 3) { // menú de transacciones de la cuenta corriente
                        System.out.println("┌──────────────────────────────────┐");
                        System.out.println("│Seleccione el tipo de transacción:│");
                        System.out.println("│ 1. Deposito                      │");
                        System.out.println("│ 2. Retiro                        │");
                        System.out.println("│ 3. Volver al menú principal      │");
                        System.out.println("└──────────────────────────────────┘");

                        opcionCuentaCorriente = sc.nextInt();

                        switch (opcionCuentaCorriente) {
                            case 1:
                                System.out.println("Ingrese la cantidad a depositar:");
                                cantidadDepositar = Float.parseFloat(br.readLine());
                                cuenta2.depositar(cantidadDepositar);
                                break;
                            case 2:
                                System.out.println("Ingrese la cantidad a retirar:");
                                cantidadRetirar = Float.parseFloat(br.readLine());
                                cuenta2.retirar(cantidadRetirar);
                                break;
                            case 3:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }

                        cuenta2.imprimir();
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        sc.close();
    }
}

