package org.example;
/**
 *
 *
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     *
     *
     */
    public static void main(String[] args) throws IOException {
        float saldo, tasaAhorros, cantidadDepositar, cantidadRetirar;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Cuenta Ahorros");
        System.out.println("Ingrese el saldo inicial");
        saldo = Float.parseFloat(br.readLine());
        System.out.println("Ingrese la tasa de interes anual");
        tasaAhorros = Float.parseFloat(br.readLine());
        CuentaAhorro cuenta1= new CuentaAhorro(saldo,tasaAhorros);
        System.out.println("Ingrese el cantidad de depositar");
        cantidadDepositar = Float.parseFloat(br.readLine());
        cuenta1.depositar(cantidadDepositar);
        System.out.println("Ingrese el cantidad retirar: $");
        cantidadRetirar = Float.parseFloat(br.readLine());
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();

    }
}
