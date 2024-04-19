package Ncantidades;
import java.util.Scanner;
public class MenorMayor
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int menoresOCero = 0, mayoresCero = 0, cantidad, N;

            System.out.print("Ingrese el número total de cantidades a analizar: ");
            N = scanner.nextInt();
            for (int i = 0; i < N; i++) {
                System.out.print("Ingrese una cantidad: ");
                cantidad = scanner.nextInt();
                if (cantidad <= 0) {
                    menoresOCero++;
                } else {
                    mayoresCero++;
                }
            }
            System.out.println("Cantidad de cantidades menores o iguales a cero: " + menoresOCero);
            System.out.println("Cantidad de cantidades mayores a cero: " + mayoresCero);

        }
    }

