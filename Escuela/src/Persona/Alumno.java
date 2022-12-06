package Persona;

import Materias.Materias;

public class Alumno extends Persona {

    public Alumno(String nombre, String domicilio, String fechaNacimiento, String sexo){
        super(nombre, domicilio, fechaNacimiento, sexo);
    }
    public void addCalificacion(Materias nombre, int calificacion, int parcial){
        if(parcial == 1){
            nombre.setCalificacion1(calificacion);
        }else if(parcial == 2){
            nombre.setCalificacion2(calificacion);
        }else if(parcial == 3){
            nombre.setCalificacion3(calificacion);
        }else{
            System.out.println("Parcial inexistente");
        }
    }
    public int getCalificacion(Materias nombre, int parcial){
        if(parcial == 1){
            return nombre.getCalificacion1();
        }else if(parcial == 2){
            return nombre.getCalificacion2();
        }else if(parcial == 3){
            return nombre.getCalificacion3();
        }else{
            return 0;
        }
    }
    public int[] getAll(Materias nombre){
        return nombre.getAllCalificaciones();
    }
}
