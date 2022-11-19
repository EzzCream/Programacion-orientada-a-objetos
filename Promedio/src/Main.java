import escuela.Alumno;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bienvenido... Ingresa la informacion del estudiante");
        System.out.println("Boleta");
        String boleta = br.readLine();
        System.out.println("Nombre");
        String nombre = br.readLine();
        System.out.println("Apellido");
        String apellido = br.readLine();
        System.out.println("Sexo");
        String sexo = br.readLine();
        Alumno persona = new Alumno(boleta, nombre, apellido, sexo);
        persona.getInfoAlumno();
        System.out.println("Excelente! Ahora dame la calificacion del examen de ingles");
        float cal1 = Float.parseFloat(br.readLine());
        System.out.println("Excelente! Ahora dame la calificacion del examen teorico");
        float cal2 = Float.parseFloat(br.readLine());
        System.out.println("Excelente! Ahora dame la calificacion del examen practico");
        float cal3 = Float.parseFloat(br.readLine());
        persona.setCalificaciones(cal1,cal2,cal3);
        System.out.println("--------------------------------------------");
        System.out.println("Esta persona ha sido: " + persona.validarEstadoIngreso());
    }
}