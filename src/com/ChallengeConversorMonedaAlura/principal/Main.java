package com.ChallengeConversorMonedaAlura.principal;

import com.ChallengeConversorMonedaAlura.modelo.Menu;
import com.ChallengeConversorMonedaAlura.modelos.ConsultaConversion;
import com.ChallengeConversorMonedaAlura.modelos.Conversion;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        ConsultaConversion consulta = new ConsultaConversion();
        Conversion conversion = new Conversion();
        Menu menu = new Menu();
        int opcion = 0;

        do{
            menu.menuPrincipal();
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    conversion.conversionMoneda("USD", "ARS", consulta);
                    break;
                case 2:
                    conversion.conversionMoneda("ARS", "USD", consulta);
                    break;
                case 3:
                    conversion.conversionMoneda("USD", "BRL", consulta);
                    break;
                case 4:
                    conversion.conversionMoneda("BRL", "USD", consulta);
                    break;
                case 5:
                    conversion.conversionMoneda("USD", "COP", consulta);
                    break;
                case 6:
                    conversion.conversionMoneda("COP", "USD", consulta);
                    break;
                case 7:
                    System.out.println("\nGRACIAS POR TU VISITA. \nSaliendo del programa.");
                default:
                    break;
            }
        } while (opcion <=6);










    }
}



