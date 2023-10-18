import java.util.Scanner;
import java.util.Random;


public class JuegoAdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int aleatorio1 = r.nextInt(100) + 1;

        //otra forma mas corta
        int aleatorio2 = (int)(Math.random() * 100) + 1;
        int intentos = 5;

        System.out.println("¡Bienvenido al juego de adivinar el número secreto!");
        System.out.println("El número secreto ha sido generado entre 1 y 100.");

        while (intentos > 0) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();

            if (num < 1 || num > 100) {
                System.out.println("El número debe estar entre 1 y 100. Inténtalo de nuevo.");
                intentos--;
                continue;
            }

            if (num == aleatorio1) {
                System.out.println("¡Felicitaciones! Has adivinado el número secreto.");
                break;
            } else if (num < aleatorio1) {
                System.out.println("El número secreto es mayor que " + num + ".");
            } else {
                System.out.println("El número secreto es menor que " + num + ".");
            }

            intentos--;
        }

        if (intentos == 0) {
            System.out.println("Lo siento, has agotado tus intentos. El número secreto era " + aleatorio1 + ".");
        }

        System.out.println("¡Gracias por jugar! ¡Hasta la próxima!");
    }
}