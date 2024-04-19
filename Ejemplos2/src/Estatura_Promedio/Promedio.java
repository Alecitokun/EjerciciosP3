package Estatura_Promedio;

import java.util.Scanner;

public class Promedio
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estatura, sumaEstaturas = 0, contador = 0;
        while (true) {
            System.out.print("Ingrese la estatura de la persona (en centímetros, ingrese 0 o un número negativo para finalizar): ");
            estatura = scanner.nextInt();
            if (estatura <= 0) {
                break;
            }
            sumaEstaturas += estatura;
            contador++;
        }
        if (contador > 0) {
            double promedio = (double) sumaEstaturas / contador;
            System.out.println("La estatura promedio del grupo es: " + promedio);
        } else {
            System.out.println("No se registró ninguna estatura, el promedio es cero.");
        }
    }
}

