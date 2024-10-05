import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Humano ingresa la constante a: ");
        double a = scanner.nextDouble();
        System.out.println("Humano ingresa la variable X0: ");
        double Xo = scanner.nextDouble();
        System.out.println("Humano ingresa la constante C: ");
        double C = scanner.nextDouble();
        System.out.println("Humano ingresa m: ");
        double m = scanner.nextDouble();
        GeneradorDeNumeros generadorDeNumeros = new GeneradorDeNumeros(a, Xo, C, m, 40);
    }
}