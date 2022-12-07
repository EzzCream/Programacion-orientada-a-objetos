import Materias.Materias;
import Persona.Alumno;
import Persona.Profesor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Materias matematicas = new Materias("Matematicas");

        Alumno alumno = new Alumno(
                "Oscar",
                "Chalco",
                "24/09/2001",
                "Masculino"
        );
        Profesor profesor = new Profesor(
                "Juan",
                "Chalco",
                "24/09/2001",
                "Masculino",
                "Profesor TC"
        );

        profesor.addCalificacionAlumno(matematicas,8,1,alumno);
        profesor.addCalificacionAlumno(matematicas,6,2,alumno);
        profesor.addCalificacionAlumno(matematicas,10,3,alumno);
        int[] calAll = alumno.getAll(matematicas);
        System.out.println("El alumno " + alumno.getNombre() + " tuvo las calificaciones de " + Arrays.toString(calAll) + " en la materia de " + matematicas.getNombre());
        System.out.println("El profesor " + profesor.getNombre() + " tuvo un salario de: " + profesor.getSalarioTotal(10));
    }
}