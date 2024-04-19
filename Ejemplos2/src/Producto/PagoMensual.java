package Producto;

public class PagoMensual
{
        public static void main(String[] args) {
            int totalPagado = 0;
            for (int mes = 1; mes <= 20; mes++) {
                int pago = 5 * (int) Math.pow(2, mes - 1);
                totalPagado += pago;
                System.out.println("Mes " + mes + ": Pago mensual de $" + pago);
            }
            System.out.println("Total pagado después de 20 meses: $" + totalPagado);
        }
    }

