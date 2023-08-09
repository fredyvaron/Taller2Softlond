package Ejercicio2;

public class ConversorMonedas {
    private double dolarAEuro;
    private double pesoADolar;

    public ConversorMonedas(double dolarAEuro, double pesoADolar) {
        this.dolarAEuro = dolarAEuro;
        this.pesoADolar = pesoADolar;
    }

    public double dolarAEuros(double cantidadDolares){
        return cantidadDolares * dolarAEuro;
    }
    public double pesoADolares(double cantidadPesos) {
        return cantidadPesos * pesoADolar;
    }
}
