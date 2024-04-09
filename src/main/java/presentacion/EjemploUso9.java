package presentacion;

import com.softtek.modelo.Calculadora;
import persistencia.CalculadoraVista;

import com.softtek.modelo.Calculadora;
import persistencia.CalculadoraVista;

public class EjemploUso9 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        CalculadoraVista vista = new CalculadoraVista();

        try {
            double num1 = vista.getNumero("pon el primer número: ");
            double num2 = vista.getNumero("pon el segundo número: ");
            char operacion = vista.getOperacion();
            double resultado = calculadora.calcular(num1, num2, operacion);
            vista.mostrarResultado(resultado);
        } catch (ArithmeticException | IllegalArgumentException e) {
            vista.mostrarError(e.getMessage());
        }
    }
}
