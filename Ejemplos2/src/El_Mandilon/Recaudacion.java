package El_Mandilon;
import java.util.Scanner;
public class Recaudacion
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double totalRecaudado = 0;
            System.out.print("Ingrese el número de ciudades (C): ");
            int C = scanner.nextInt();
            System.out.print("Ingrese el número de tiendas por ciudad (T): ");
            int T = scanner.nextInt();
            System.out.print("Ingrese el número de empleados por tienda (N): ");
            int N = scanner.nextInt();
            for (int ciudad = 1; ciudad <= C; ciudad++) {
                double totalVentasCiudad = 0;
                System.out.println("Ciudad " + ciudad);
                for (int tienda = 1; tienda <= T; tienda++) {
                    double totalVentasTienda = 0;
                    System.out.println("Tienda " + tienda);
                    for (int empleado = 1; empleado <= N; empleado++) {
                        System.out.print("Ingrese las ventas del empleado " + empleado + " de la tienda " + tienda + " en la ciudad " + ciudad + ": $");
                        double ventasEmpleado = scanner.nextDouble();
                        totalVentasTienda += ventasEmpleado;
                    }
                    System.out.println("Las ventas totales de la tienda " + tienda + " en la ciudad " + ciudad + " son: $" + totalVentasTienda);
                    totalVentasCiudad += totalVentasTienda;
                }
                System.out.println("Las ventas totales en la ciudad " + ciudad + " son: $" + totalVentasCiudad);
                totalRecaudado += totalVentasCiudad;
            }
            System.out.println("El total recaudado por la cadena en un solo día es: $" + totalRecaudado);

        }
    }

