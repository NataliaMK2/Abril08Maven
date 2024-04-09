package persistencia;

import java.util.Scanner;

public class CalculadoraVista {
    Scanner scanner = new Scanner(System.in);

    public double getNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public char getOperacion() {
        System.out.print("Seleccione (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void mostrarError(String mensaje) {
        System.err.println("Error: " + mensaje);
    }
}
