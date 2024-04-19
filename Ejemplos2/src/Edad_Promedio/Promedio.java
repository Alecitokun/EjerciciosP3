package Edad_Promedio;
import java.util.Scanner;
public class Promedio
{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N, edad, sumaEdades = 0, contador = 0;

            System.out.print("Ingrese el número de alumnos: ");
            N = scanner.nextInt();

            while (contador < N) {
                System.out.print("Ingrese la edad del alumno " + (contador + 1) + ": ");
                edad = scanner.nextInt();
                sumaEdades += edad;
                contador++;
            }
            double promedio = (double) sumaEdades / N;
            System.out.println("La edad promedio del grupo es: " + promedio);

        }
    }


