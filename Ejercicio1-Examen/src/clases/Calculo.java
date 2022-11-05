package clases;

public class Calculo {

    private final double radioEcuatorial;

    public Calculo(double radio){
        radioEcuatorial = radio;
    }
    public double getVolumen(){
        double cal = 1.333 * 3.1415;
        double cubo = radioEcuatorial * radioEcuatorial * radioEcuatorial;
        return cal * cubo;
    }
}
