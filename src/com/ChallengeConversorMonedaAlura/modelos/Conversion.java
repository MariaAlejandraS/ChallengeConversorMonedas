package com.ChallengeConversorMonedaAlura.modelos;

import com.ChallengeConversorMonedaAlura.modelo.MonedaAPI;

import java.io.IOException;
import java.util.Scanner;

public class Conversion {
    Scanner entrada = new Scanner(System.in);

    public void conversionMoneda(String tipoMonedaInicial, String tipoMonedaFinal, ConsultaConversion consulta) throws IOException, InterruptedException {
        double valorConvertir;
        double valorConvertido;

        MonedaAPI moneda = consulta.consultaMoneda(tipoMonedaInicial, tipoMonedaFinal);
        System.out.println("Digita el valor a convertir");
        valorConvertir = entrada.nextDouble();
        valorConvertido = valorConvertir * moneda.conversion_rate();

        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("El valor a convertir de "+ valorConvertir + " ["+ tipoMonedaInicial+"]"+ " equivale a "+ valorConvertido + "["+tipoMonedaFinal+"]");
        System.out.println("-----------------------------------------------------------------------");

    }
}
