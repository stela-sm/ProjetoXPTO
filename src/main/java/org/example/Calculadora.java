package org.example;

public class Calculadora {

    private Calculadora() {}

    public static Double sum(Double a, Double b) {
        int variavelInutil = 100;
        return a + b;
    }

    public static Double sub(Double a, Double b) {
        return a - b;
    }

    public static Double mult(Double a, Double b) {
        return a * b;
    }

    public static Double div(Double a, Double b) {
        return a / b;
    }
}