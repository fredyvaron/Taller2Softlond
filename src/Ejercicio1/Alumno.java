package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private   Integer edad;
    private List<Double> calificaciones;

    public Alumno(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }
    public  void agregarCalificacion(double calificacion){
        calificaciones.add(calificacion);
    }
    public  double calcularPromedio(){
        if(calificaciones.isEmpty()){
            return 0.0;
        }
        double suma = 0.0;
        for (double calificacion: calificaciones){
            suma += calificacion;
        }
        return  suma/calificaciones.size();
    }
    public  void mostrarInformacion () {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("calificaciones: "+ calificaciones);
        System.out.println("Promedio: "+ calcularPromedio());
        System.out.println();
    }
}
