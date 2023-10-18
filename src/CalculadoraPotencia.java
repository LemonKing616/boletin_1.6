import java.util.Scanner;

public class CalculadoraPotencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        double potencia = 1;

        do {
            System.out.print("Introduce el número base (entero positivo o 0): ");
            base = sc.nextInt();
        } while (base < 0);

        do {
            System.out.print("Introduce el exponente (entero positivo o 0): ");
            exponente = sc.nextInt();
        } while (exponente < 0);

        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + potencia);
    }
}