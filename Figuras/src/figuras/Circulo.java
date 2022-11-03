package figuras;

public class Circulo extends InitFig{
    private final double radio = getLado1();

    public Circulo(double lado1) {
        super(lado1);
    }
    public double area(){
        double cua = radio * radio;
        return 3.1415 * cua;
    }
    public double perimetro(){
        return 2 * 3.1415 * radio;
    }
}
