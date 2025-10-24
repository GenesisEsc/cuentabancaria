package org.example;
/*
 * author: Genesis Escobar
 * fecha: 23/10/2025
 * Descripcion: Esta clase denominada CuentaCorriente modela una cuenta bancaria que es una
 * subclase de Cuenta. Tiene un nuevo atributo: sobregiro
 */
public class CuentaCorriente extends Cuenta {
    float sobregiro;
    /**
     * Constructor de la clase CuentaCorriente
     * @param saldo Parametro que define el saldo de la cuenta corriente
     * @param tasa Parametro que define la tasa anual de interes de la cuenta corriente
     */
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro=0;
    }
    /**
     * Metodo que retira dinero de la cuenta actualizando su saldo. Se pue de retirar dinero
     * superior al saldo. El dinero que se debe queda como sobregiro.
     * @param cantidad Parametro que define cuanto se va a retirar
     */
    public void retira(float cantidad) {
        float resultado = saldo - cantidad;
        if(resultado<0){
            sobregiro = sobregiro - resultado;
            saldo=0;
        }else{
            super.retirar(cantidad);
        }
    }

    public void depositar(float cantidad) {
        float residuo = sobregiro - cantidad;
        if(sobregiro > 0) {
            if (residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            }else{
                sobregiro =- residuo;
                saldo = 0;
            }
        }else {
            super.depositar(cantidad);
        }
    }
    public void imprimir(){
        System.out.println("Saldo: $"+saldo);
        System.out.println("Cargo mensual: $" + comisionMensual);
        System.out.println("Numero de transacciones: " + (numeroDepositos+ numeroRetiro));
        System.out.println("Valor de sobregiros = $" + sobregiro);
    }
}
