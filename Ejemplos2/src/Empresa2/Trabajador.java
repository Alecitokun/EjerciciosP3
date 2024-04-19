package Empresa2;
import java.util.Scanner;

public class Trabajador
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int totalPagoEmpresa = 0;
            System.out.print("Ingrese el número de trabajadores (N): ");
            int N = sc.nextInt();
            for (int trabajador = 1; trabajador <= N; trabajador++) {
                int sueldo = 0;
                System.out.println("Trabajador " + trabajador);
                for (int dia = 1; dia <= 5; dia++) { // 1: Lunes, 2: Martes, ..., 5: Viernes
                    System.out.print("Ingrese las horas trabajadas para el día " + dia + ": ");
                    int horasTrabajadas = sc.nextInt();
                    sueldo += horasTrabajadas;
                }
                System.out.println("El sueldo semanal del trabajador " + trabajador + " es: $" + sueldo);
                totalPagoEmpresa += sueldo;
            }
            System.out.println("El total pagado por la empresa a los " + N + " empleados es: $" + totalPagoEmpresa);
        }
    }

