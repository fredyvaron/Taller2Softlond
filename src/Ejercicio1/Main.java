package Ejercicio1;

public class Main {
    public static void main(String[] args) {


        SistemaAlumnos sistema = new SistemaAlumnos();

        Alumno alumno1 = new Alumno("fredy", 28);
        Alumno alumno2 = new Alumno("alex", 25);

        sistema.agregarAlumno(alumno1);
        sistema.agregarCalificacion(alumno1, 7.5);
        sistema.agregarCalificacion(alumno1, 6.5);
        sistema.agregarCalificacion(alumno1, 5.5);
        sistema.agregarAlumno(alumno2);
        sistema.agregarCalificacion(alumno2, 8.5);
        sistema.agregarCalificacion(alumno2, 7.5);
        sistema.agregarCalificacion(alumno2, 9.0);
        sistema.mostrarInformacion();

    }
}