package Materias;

public class Materias {
    private String nombre;
    private int calificacion1;
    private int calificacion2;
    private int calificacion3;

    public Materias(String nombre) {
        this.nombre = nombre;
    }

    public Materias(int calificacion1, int calificacion2, int calificacion3) {
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public int getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(int calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public int getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(int calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public int getCalificacion3() {
        return calificacion3;
    }

    public void setCalificacion3(int calificacion3) {
        this.calificacion3 = calificacion3;
    }
    public int[] getAllCalificaciones(){
        return new int[]{calificacion1,calificacion2,calificacion3};
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}