package Ejercicio4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear hoteles y agregar habitaciones
        Hotel hotel = new Hotel("Hotel A");
        hotel.agregarHabitacion(101, "Individual");
        hotel.agregarHabitacion(102, "Doble");
        hotel.agregarHabitacion(103, "Suite");
        hotel.agregarHabitacion(104, "Suite");
        hotel.agregarHabitacion(105, "Suite");

        // Crear clientes
        Cliente cliente1 = new Cliente("Alex", "1234567890");
        Cliente cliente2 = new Cliente("Fredy", "0987654321");

        // Listar habitaciones disponibles en cada hotel
        System.out.println("Habitaciones disponibles en " + hotel.getNombre() + ":");
        List<Habitacion> habitacionesDisponiblesHotel = hotel.getHabitacionesDisponibles();
        for (Habitacion habitacion : habitacionesDisponiblesHotel) {
            System.out.println("Habitación " + habitacion.getNumero() + " (" + habitacion.getTipo() + ")");
        }



        // Realizar reservas
        List<Habitacion> habitacionesAReservar = Arrays.asList(habitacionesDisponiblesHotel.get(0), habitacionesDisponiblesHotel.get(1));
        Reserva reserva1 = hotel.reservaHabitaciones(cliente1, habitacionesAReservar);
        Reserva reserva2 = hotel.reservaHabitaciones(cliente2, habitacionesAReservar);

        // Mostrar información de la reserva 1
        System.out.println("\nReserva realizada por " + reserva1.getCliente().getNombre() + " de la empresa " + reserva1.getCliente().getCedula() + ":");
        for (Habitacion habitacion : reserva1.getHabitaciones()) {
            System.out.println("Hotel: " + reserva1.getHotel().getNombre() + " - Habitación " + habitacion.getNumero());
        }
        // Mostrar información de la reserva 2
        System.out.println("\nReserva realizada por " + reserva2.getCliente().getNombre() + " de la empresa " + reserva2.getCliente().getCedula() + ":");
        for (Habitacion habitacion : reserva2.getHabitaciones()) {
            System.out.println("Hotel: " + reserva2.getHotel().getNombre() + " - Habitación " + habitacion.getNumero());
        }

        // Cancelar reserva
        hotel.cancelarReserva(reserva1);
        System.out.println("\nReserva cancelada por " + reserva1.getCliente().getNombre() + " de la empresa " + reserva1.getCliente().getCedula());

        // Mostrar información de las habitaciones disponibles después de cancelar la reserva
        System.out.println("\nHabitaciones disponibles en " + hotel.getNombre() + " después de cancelar la reserva:");
        habitacionesDisponiblesHotel = hotel.getHabitacionesDisponibles();
        for (Habitacion habitacion : habitacionesDisponiblesHotel) {
            System.out.println("Habitación " + habitacion.getNumero() + " (" + habitacion.getTipo() + ")");
        }
    }
}
