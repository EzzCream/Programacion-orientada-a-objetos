package figuras;

public class InitFig {
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;

    public InitFig(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public InitFig(double lado1, double lado2, double lado3, double altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }
    public InitFig(double lado1){
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getAltura() {
        return altura;
    }
}
