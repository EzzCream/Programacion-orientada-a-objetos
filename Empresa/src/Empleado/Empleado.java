package Empleado;

import Personas.Persona;

public abstract class Empleado extends Persona {
    private int horasTrabajadas;
    private int tarifaHora;

    public Empleado(String nombre, String domicilio, String fechaNacimiento, char sexo, int horasTrabajadas, int tarifaHora) {
        super(nombre, domicilio, fechaNacimiento, sexo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    public float calcularNomina(){
        float res = horasTrabajadas * tarifaHora;
        return res;
    }
}
