package figuras;

public class Rectangulo extends InitFig {
    private final double base = getLado1();
    private final double altura = getLado2();

    public Rectangulo(double lado1, double lado2) {
        super(lado1, lado2);
    }
    public double area(){
        return base * altura;
    }
    public double perimetro(){
        return base + base + altura + altura;
    }
}
