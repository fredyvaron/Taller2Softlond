package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(4, 2);
        System.out.println("Suma: "+calculadora.Suma());
        System.out.println("Multiplicacion: "+calculadora.Multi());
        System.out.println("Division: "+calculadora.Division());
        System.out.println("Resta: "+calculadora.Resta());
    }
}
