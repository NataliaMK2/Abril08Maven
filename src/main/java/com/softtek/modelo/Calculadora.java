package com.softtek.modelo;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Calculadora {
    public double calcular(double num1, double num2, char operacion) {
        double resultado = 0.0;
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir por 0");
                }
                resultado = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("error");
        }
        return resultado;
    }
}

