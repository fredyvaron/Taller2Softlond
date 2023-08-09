package Ejercicio4;

import java.util.List;

public class Reserva {

    //Cliente
    private Cliente cliente;
    //Hotel
    private Hotel hotel;
    //Habitacion
    private List<Habitacion> habitaciones;

    public Reserva(Cliente cliente, Hotel hotel, List<Habitacion> habitaciones) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.habitaciones = habitaciones;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
}
