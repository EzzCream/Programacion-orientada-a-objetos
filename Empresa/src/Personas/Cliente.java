package Personas;

public class Cliente extends Persona {
    private String razonSocial;
    private String telefono;

    public Cliente(
            String razonSocial,
            String telefono,
            String nombre,
            String domicilio,
            String fechaNacimiento,
            char sexo
    ) {
        super(nombre, domicilio, fechaNacimiento, sexo);
        this.razonSocial = razonSocial;
        this.telefono = telefono;
    }
    public void imprimirCartera(){
        System.out.println(razonSocial + " - " + telefono);
    }
}
