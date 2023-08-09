package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    //nombre
    private String nombre;
    //Habitacion
    private List<Habitacion> habitaciones;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    //Agregar Habitacion
    public void agregarHabitacion(int numero, String tipo) {
        habitaciones.add(new Habitacion(numero, tipo));
    }
    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> habitacionesDisponibles = new ArrayList<>();
        for (Habitacion habitacion: habitaciones){
            if(!habitacion.isReservada()){
                habitacionesDisponibles.add(habitacion);
            }
        }
        return  habitacionesDisponibles;
    }

    // Reservar
    public Reserva reservaHabitaciones(Cliente cliente, List<Habitacion> habitacionesAReservar){
        for (Habitacion habitacion: habitacionesAReservar){
            if(!habitaciones.contains(habitacion) || habitacion.isReservada()){
                System.out.println("Una o mas habitaciones no estan disponibles para reservar");
            }
        }
        Reserva reserva = new Reserva(cliente, this, habitacionesAReservar);
        for (Habitacion habitacion: habitacionesAReservar){
            habitacion.setReservada(true);
        }
        return  reserva;
    }

    // Cancelar
    public void cancelarReserva(Reserva reserva){
       if (reserva.getHotel() != this){
           System.out.println("Error en la reserva");
       }
       for (Habitacion habitacion: reserva.getHabitaciones()){
           habitacion.setReservada(false);
       }
    }
}
