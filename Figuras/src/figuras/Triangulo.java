package figuras;

public class Triangulo extends InitFig{
    private final double base = getLado1();
    private final double number2 = getLado2();
    private final double number3 = getLado3();
    private final double altura = getAltura();

    public Triangulo(double lado1, double lado2, double lado3, double altura) {
        super(lado1, lado2, lado3, altura);
    }
    public double area(){
        double are = base * altura;
        return are/2;
    }
    public double perimetro(){
        return base + number2 + number3;
    }
}
