package Empleado;

public class Directivos extends Empleado {
    private int bonusEspecial;
    private String puesto;

    public Directivos(
            String nombre,
            String domicilio,
            String fechaNacimiento,
            char sexo,
            int horasTrabajadas,
            int tarifaHora,
            int bonusEspecial,
            String puesto
    ) {
        super(nombre, domicilio, fechaNacimiento, sexo, horasTrabajadas, tarifaHora);
        this.bonusEspecial = bonusEspecial;
        this.puesto = puesto;
    }
}
