package Persona;

public class Carretera
{
        public static void main(String[] args) {
            int kmPersona1 = 70;
            int kmPersona2 = 150;

            while (kmPersona1 != kmPersona2) {
                if (kmPersona1 < kmPersona2) {
                    kmPersona1++;
                    kmPersona2--;
                } else {
                    kmPersona1--;
                    kmPersona2++;
                }
            }
            System.out.println("Las personas se encuentran en el kilómetro " + kmPersona1 + " de la carretera.");
        }
    }

