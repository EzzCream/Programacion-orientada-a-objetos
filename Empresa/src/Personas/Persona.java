package Personas;

public abstract class Persona {
    private String nombre;
    private String domicilio;
    private String fechaNacimiento;
    private char sexo;

    public Persona(String nombre, String domicilio, String fechaNacimiento, char sexo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    public void getInfo(){
        System.out.println(nombre + " " + domicilio + " " + fechaNacimiento + " " + sexo);
    }
}
