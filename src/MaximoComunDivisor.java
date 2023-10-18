import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número entero mayor que 0: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo número entero mayor que 0: ");
        int numero2 = sc.nextInt();

        // Verificar que los números ingresados sean mayores que 0
        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Los números deben ser mayores que 0.");
        } else {
            int mcd = calcularMCD(numero1, numero2);
            System.out.println("El máximo común divisor (MCD) de " + numero1 + " y " + numero2 + " es: " + mcd);
        }
    }

    // Método para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int numero1, int numero2) {
        while (numero2 != 0) {
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }
        return numero1;
    }
}