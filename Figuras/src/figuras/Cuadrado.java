package figuras;

public class Cuadrado extends InitFig {

    private final double number1 = getLado1();

    public Cuadrado(double lado1) {
        super(lado1);
    }
    public double area(){
        return number1 * number1;
    }
    public double perimetro(){
        return number1 * 4;
    }
}
