import Materias.Materias;
import Persona.Alumno;
import Persona.Persona;
import Persona.Profesor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Materias matematicas = new Materias();

        Alumno alumno = new Alumno(
                "Oscar",
                "Chalco",
                "24/09/2001",
                "Masculino"
        );
        Profesor profesor = new Profesor(
                "Oscar",
                "Chalco",
                "24/09/2001",
                "Masculino",
                "Profesor TC"
        );

        profesor.addCalificacionAlumno(matematicas,8,1,alumno);
        profesor.addCalificacionAlumno(matematicas,6,2,alumno);
        profesor.addCalificacionAlumno(matematicas,10,3,alumno);
        int[] calAll = alumno.getAll(matematicas);
        System.out.println(Arrays.toString(calAll));
        profesor.getSalarioTotal(10);
    }
}