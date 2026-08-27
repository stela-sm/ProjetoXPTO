package org.example;



public class Calculadora {

    private String API_KEY = "sjkahdkjahdkjhsdkjasd878978978789897";
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

    public static Double squareRoot(Double a){
      return Math.sqrt(25.0);
    }
}