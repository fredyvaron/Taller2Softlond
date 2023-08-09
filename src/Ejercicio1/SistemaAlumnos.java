package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlumnos {
    private List<Alumno> alumnos;

    public SistemaAlumnos() {
        this.alumnos = new ArrayList<>();
    }
    //Agregar
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    //asignar Calificacion
    public  void agregarCalificacion(Alumno alumno, double calificacion){
        alumno.agregarCalificacion(calificacion);
    }
    //mostrar Informacion
    public void mostrarInformacion() {
        for (Alumno  alumno: alumnos ) {
            alumno.mostrarInformacion();
        }

    }
}
