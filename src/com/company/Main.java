package com.company;

import clases.CapacidadEndedudamiento;

import java.util.Scanner;

import static clases.Constantes.*;

public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        Scanner in = new Scanner(System.in);
        CapacidadEndedudamiento capacidadEndedudamiento = new CapacidadEndedudamiento();
        int ingMesuales;
        int gastoFijo;
        int gastoVariable;

        System.out.println(INGRESO_MENSUAL);
        String ent = in.next();
        while (!isNumeric(ent)) {
            System.out.println(INGRESO_MENSUAL);
            ent = in.next();
        }
        ingMesuales = Integer.parseInt(ent);
        capacidadEndedudamiento.setIngresosTotales(ingMesuales);

        String entrada = "SI";
        while (entrada.equals("SI")) {
            System.out.println(GASTO_FIJO);
            entrada = in.next();//M
            while (!isNumeric(entrada)) {//M
                System.out.println(GASTO_FIJO);//M
                entrada = in.next();//M
            }
            gastoFijo = Integer.parseInt(entrada);
            capacidadEndedudamiento.setGastosFijos(gastoFijo);

            System.out.println(GASTO_VARIABLE);
            entrada = in.next();//M
            while (!isNumeric(entrada)) {//M
                System.out.println(GASTO_VARIABLE);
                entrada = in.next();//M
            }
            gastoVariable = Integer.parseInt(entrada);
            capacidadEndedudamiento.setGastoVaribales(gastoVariable);

            System.out.println(capacidadEndedudamiento.getCapacidadEndeudamiento());

            System.out.println(DESEA_CONTINUAR);//M
            entrada = in.next().toUpperCase();//M
            //Esto te dara la primera entrada al proceso de solicitar los datos para instancir nuestro objeto
            // CapacidadEndedudamiento()
            //Valida las entradas de los usuarios que no vayas a convertir una "A" numero y el calculo no te funcione
            //Utiliza el metodo is numeric para vada entrada de ser necesarios
        }
        in.close();
        System.out.println(FINALIZACION);
    }

    public static boolean isNumeric(String value) {
        // implementa un bloque try catch aca
        try {
            Double.parseDouble(value);
            return true;
        } catch (Exception e) {
            System.out.println(VALIDACION);
            return false;
        }
    }
}
