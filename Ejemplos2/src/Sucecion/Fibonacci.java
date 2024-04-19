package Sucecion;

public class Fibonacci
{
        public static void main(String[] args) {
            int a = 0;
            int b = 1;
            int contador = 2;
            int N = 10; // Cambiar N por el número deseado de elementos de la sucesión

            System.out.println(a);
            System.out.println(b);
            while (contador < N) {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
                contador++;
            }
        }
    }

