package org.example;


import static org.example.Calculadora.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(Calculadora.sum(10.0, 5.0));
        System.out.println(Calculadora.sub(10.0, 5.0));
        System.out.println(Calculadora.mult(10.0, 5.0));
        System.out.println(Calculadora.div(10.0, 5.0));
        System.out.println(Calculadora.squareRoot(9D));
    }
}
