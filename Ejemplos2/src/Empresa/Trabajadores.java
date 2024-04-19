package Empresa;
import java.util.Scanner;

public class Trabajadores
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int totalPagoEmpresa = 0;
            System.out.print("Ingrese el número de trabajadores (N): ");
            int N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                System.out.print("Ingrese las horas trabajadas por el empleado " + i + ": ");
                int horasTrabajadas = sc.nextInt();
                System.out.print("Ingrese la tarifa por hora para el empleado " + i + ": ");
                int tarifaPorHora = sc.nextInt();
                int sueldo = horasTrabajadas * tarifaPorHora;
                totalPagoEmpresa += sueldo;
                System.out.println("El sueldo semanal del empleado " + i + " es: $" + sueldo);
            }
            System.out.println("El total pagado por la empresa a los " + N + " empleados es: $" + totalPagoEmpresa);
        }
    }

