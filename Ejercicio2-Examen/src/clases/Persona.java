package clases;

public class Persona {
    private String nombre;
    private int edad;
    private String hobbie;
    private String eCivil;

    public Persona(String nombre,int edad,String hobbie,String eCivil){
        this.nombre = nombre;
        this.edad = edad;
        this.hobbie = hobbie;
        this.eCivil = eCivil;
    }
    private int getEdad20(){
        int an = 2072 - 2022;
        return edad + an;
    }
    public void getInfo(){
        System.out.println("Hola, mi nombre es " + nombre + " tengo " + edad + " años, me gusta " + hobbie + ", soy " + eCivil + " y en 2072 tendre " + getEdad20() + "... veremos que cambia en ese tiempo"  );
    }
}
