import Empleado.Directivos;
import Empresa.Empresa;
import Personas.Cliente;

public class Main {
    public static void main(String[] args) {
        Empresa empresaFantasma = new Empresa("Ulala","En algun lugar","Mortal");
        empresaFantasma.desplegarInfo();
        Cliente cliente = new Cliente("No c que es razon social","5530234861","Oscar","Chalco","2001-09-24",'M');
        cliente.imprimirCartera();
        Directivos directivo = new Directivos("Juan","nunca jamas","ayer", 'F',8,2000,0,"PLEASE");
        System.out.println(directivo.calcularNomina());
    }
}