package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        double pesoADolar = 0.00024;
        double dolarAEuro = 0.91;
        double cantidadEuros = 100;
        double CantidadPesos = 4167;
        ConversorMonedas conversor = new ConversorMonedas(dolarAEuro, pesoADolar);

        double resultadoDolares = conversor.pesoADolares(CantidadPesos);
        System.out.println(CantidadPesos + " Pesos son: " + resultadoDolares + " Dolares");

        double resultadoEuros = conversor.dolarAEuros(cantidadEuros);
        System.out.println(cantidadEuros + " Dolares son: " + resultadoEuros + " Euros");


    }
}
