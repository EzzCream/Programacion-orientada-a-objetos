package calculadora;

public class InitOp {
    private double number1;
    private double number2;

    public InitOp(double number1,double number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public void setNumbers(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public double getNumber1(){
        return this.number1;
    }
    public double getNumber2(){
        return this.number2;
    }
}
