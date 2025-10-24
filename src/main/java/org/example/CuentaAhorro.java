package org.example;
/*
 * author: Genesis Escobar
 * fecha: 23/10/2025
 * Descripcion: Esta clase denominada CuentaAhorro modela una cuenta de ahorros
 * que es una subclase de Cuenta. Tiene un nuevo atributo activa
 */
public class CuentaAhorro extends Cuenta {
    /*
    Atributo que identifica si una cuenta está activa, lo esta si su saldo es superior a 10 dolares
     */
    private boolean activa;
    /**
     * Constructor de la clase Cuenta Ahorros
     * @param saldo Parametro que define el saldo de la cuenta de ahorros
     * @param tas Parametro que define la tasa anual de interés de la cuenta de ahorro
     */
    public CuentaAhorro(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10) {
            activa = false;
        }
        else
            activa = true;
    }
    /**
     * Metodo que recibe una cantidad de dinero a consignar o depositar y actualiza
     * el saldo de la cuenta
     * @param saldo Parametro que define la cantidad a consignar en una cuenta de ahorros
     */
    public void depositar(float cantidad) {
        if (activa) {
            super.depositar(cantidad);
        }
    }
    /**
     * Metodo que recibe una cantidad de dinero a retirar y actualiza el saldo de la cuenta
     * @param saldo Parametro que define la cantidad a retirar de una cuenta de ahorros
     */
    public void retirar(float cantidad) {
        if (activa)
            super.retirar(cantidad);
    }
    /**
     * Metodo que genera el extracto mensual de una cuenta de ahorros
     */
    public void extractoMensual(){
        if (numeroRetiro > 4) {
            comisionMensual =numeroRetiro+((numeroRetiro-4)*1);
        }
        super.extractoMensual();
        if (saldo < 10)
            activa = false;
    }
    public void imprimir() {
        System.out.printf("Saldo= $ %.2f\n", saldo);
        System.out.printf("Comision mensual = $ %.2f\n", comisionMensual);
        System.out.println("Numero de transacciones:" +(numeroDepositos + numeroRetiro));
    }
}
