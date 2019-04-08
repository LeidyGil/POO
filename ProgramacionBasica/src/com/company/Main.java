package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculo del valor de una cuota:");
        double prestamo = LeerVariable.leerReal("Valor del préstamo?");
        double interes=LeerVariable.leerReal("Interes por periodo?")/100;
        double plazo = LeerVariable.leerReal("Periodos?");
        double factor=Math.pow(1+interes,plazo);
        double cuota=prestamo*(factor*interes)/(factor-1);
        System.out.println("Valor cuota="+cuota);
    }
}
