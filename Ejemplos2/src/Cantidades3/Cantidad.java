package Cantidades3;
import java.util.Scanner;

public class Cantidad
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int suma = 0;
            for (int contador = 1; contador <= 10; contador++) {
                System.out.print("Ingrese una cantidad: ");
                int cantidad = scanner.nextInt();
                suma += cantidad;
            }
            System.out.println("La suma de las diez cantidades es: " + suma);

        }
    }

