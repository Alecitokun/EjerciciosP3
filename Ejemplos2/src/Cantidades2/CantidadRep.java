package Cantidades2;
import java.util.Scanner;
public class CantidadRep
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int cantidad, suma = 0, contador = 0;
            do {
                System.out.print("Ingrese una cantidad: ");
                cantidad = scanner.nextInt();
                suma += cantidad;
                contador++;
            } while (contador < 10);
            System.out.println("La suma de las diez cantidades es: " + suma);

        }
    }

