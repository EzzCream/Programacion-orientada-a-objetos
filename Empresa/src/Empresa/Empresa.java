package Empresa;

public class Empresa {
    private String nombre;
    private String domicilio;
    private String giro;

    public Empresa(String nombre, String domicilio, String giro){
        this.domicilio = domicilio;
        this.giro = giro;
        this.nombre = nombre;
    }
    public void desplegarInfo(){
        System.out.println("El nombre de la empresa es:" + this.nombre + " y se encuntra en: " + this.domicilio + " con giro de: " + this.giro);
    }
}
