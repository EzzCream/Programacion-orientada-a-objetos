import figuras.*;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(6);
        double area = cuadrado.area();
        double perimetro = cuadrado.perimetro();
        System.out.println("El area del cuadrado es: " + area + " y el perimetro es: " + perimetro);

        Rectangulo rectangulo = new Rectangulo(4,6);
        double areaRec = rectangulo.area();
        double perimetroRec = rectangulo.perimetro();
        System.out.println("El area del rectangulo es: " + areaRec + " y el perimetro es: " + perimetroRec);

        Triangulo triangulo = new Triangulo(3,4,5,2);
        double areaTri = triangulo.area();
        double perimetroTri = triangulo.perimetro();
        System.out.println("El area del triangulo es: " + areaTri + " y el perimetro es: " + perimetroTri);

        Circulo circulo = new Circulo(5);
        double areaCir = circulo.area();
        double perimetroCir = circulo.perimetro();
        System.out.println("El area del circulo es: " + areaCir + " y el perimetro es: " + perimetroCir);

    }
}