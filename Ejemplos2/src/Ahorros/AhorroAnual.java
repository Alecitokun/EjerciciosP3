package Ahorros;
import java.util.Scanner;

public class AhorroAnual
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int mes = 1;
            double ahorroTotal = 0;
            while (mes <= 12) {
                System.out.print("Ingrese la cantidad ahorrada en el mes " + mes + ": ");
                double cantidad = scanner.nextDouble();
                ahorroTotal += cantidad;
                System.out.println("El ahorro acumulado hasta el mes " + mes + " es: " + ahorroTotal);
                mes++;
            }
            System.out.println("El ahorro total al final del año es: " + ahorroTotal);

        }
    }

