package Ejercicio4;

public class Habitacion {

    //numero
    private int numero;
    //tipo
    private  String tipo;
    private boolean reservada;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.reservada = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }
}
