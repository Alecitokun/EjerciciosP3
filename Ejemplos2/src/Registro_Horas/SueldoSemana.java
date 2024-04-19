package Registro_Horas;
import java.util.Scanner;

public class SueldoSemana
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalHoras = 0;
            int dia = 1;
            int sueldoPorHora = 10;
            int sueldoTotal = 0;

            while (dia <= 6) {
                System.out.print("Ingrese las horas trabajadas del día " + dia + ": ");
                int horasTrabajadas = scanner.nextInt();
                totalHoras += horasTrabajadas;
                dia++;
            }
            sueldoTotal = totalHoras * sueldoPorHora;
            System.out.println("El total de horas trabajadas es: " + totalHoras);
            System.out.println("El sueldo recibido por las horas trabajadas es: " + sueldoTotal);

        }
    }

