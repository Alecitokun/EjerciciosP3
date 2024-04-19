package Tiki_Taka;
import java.util.Scanner;

public class Tienda
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int ventasMayores1000 = 0;
            int ventasEntre500y1000 = 0;
            int ventasMenoresIguales500 = 0;
            double montoTotalMayores1000 = 0;
            double montoTotalEntre500y1000 = 0;
            double montoTotalMenoresIguales500 = 0;
            double montoTotalGlobal = 0;

            System.out.print("Ingrese el número de ventas: ");
            int N =sc.nextInt();

            for (int i = 1; i <= N; i++) {
                System.out.print("Ingrese el monto de la venta " + i + ": ");
                double montoVenta = sc.nextDouble();

                if (montoVenta > 1000) {
                    ventasMayores1000++;
                    montoTotalMayores1000 += montoVenta;
                } else if (montoVenta > 500) {
                    ventasEntre500y1000++;
                    montoTotalEntre500y1000 += montoVenta;
                } else {
                    ventasMenoresIguales500++;
                    montoTotalMenoresIguales500 += montoVenta;
                }
                montoTotalGlobal += montoVenta;
            }
            System.out.println("Ventas mayores a $1000: " + ventasMayores1000);
            System.out.println("Monto total de ventas mayores a $1000: $" + montoTotalMayores1000);
            System.out.println("Ventas entre $500 y $1000: " + ventasEntre500y1000);
            System.out.println("Monto total de ventas entre $500 y $1000: $" + montoTotalEntre500y1000);
            System.out.println("Ventas menores o iguales a $500: " + ventasMenoresIguales500);
            System.out.println("Monto total de ventas menores o iguales a $500: $" + montoTotalMenoresIguales500);
            System.out.println("Monto total global de ventas: $" + montoTotalGlobal);

        }
    }
}
