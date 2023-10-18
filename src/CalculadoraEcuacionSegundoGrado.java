import java.util.Scanner;

public class CalculadoraEcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el coeficiente A: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el coeficiente B: ");
        double b = sc.nextDouble();

        System.out.print("Introduce el coeficiente C: ");
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación no tiene solución.");
            } else {
                double solucion = -c / b;
                System.out.println("La ecuación tiene una solución: x = " + solucion);
            }
        } else {
            if (discriminante > 0) {
                double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones: x1 = " + solucion1 + ", x2 = " + solucion2);
            } else if (discriminante == 0) {
                double solucion = -b / (2 * a);
                System.out.println("La ecuación tiene una solución doble: x = " + solucion);
            } else {
                System.out.println("La ecuación no tiene solución real.");
            }
        }
    }
}