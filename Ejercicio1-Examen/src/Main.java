import clases.Calculo;

public class Main {
    public static void main(String[] args) {
        Calculo calculo = new Calculo(2439);
        double vol1 = calculo.getVolumen();
        Calculo calculo2 = new Calculo(6051);
        double vol2 = calculo2.getVolumen();

        System.out.println("El volumen de Mercurio es: " + vol1 + " y el de Venus es: "+ vol2);
    }
}