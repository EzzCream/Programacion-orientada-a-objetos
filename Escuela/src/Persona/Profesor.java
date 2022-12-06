package Persona;

import Materias.Materias;

import java.util.Objects;

public class Profesor extends Persona {
    private String tipoProfesor;
    private static int salarioMensual = 10000;
    private static int becaPorAnio = 3000;
    private float salarioTotal;
    public Profesor(
            String nombre,
            String domicilio,
            String fechaNacimiento,
            String sexo,
            String tipoProfesor){
        super(nombre, domicilio, fechaNacimiento, sexo);
        this.tipoProfesor = tipoProfesor;
    }

    public String getTipoProfesor() {
        return tipoProfesor;
    }

    public void setTipoProfesor(String tipoProfesor) {
        this.tipoProfesor = tipoProfesor;
    }

    public void addCalificacionAlumno(Materias nombre, int calificacion, int parcial, Alumno nombreAl){
        nombreAl.addCalificacion(nombre, calificacion, parcial);
    }
    public float getSalarioTotal(int anios){
        if(Objects.equals(tipoProfesor, "Profesor TC")){
            float beca = becaPorAnio * anios;
            this.salarioTotal = salarioMensual + beca;
            return this.salarioTotal;
        }else{
            this.salarioTotal = salarioMensual;
            return this.salarioTotal;
        }
    }
}
