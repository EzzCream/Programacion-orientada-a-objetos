package calculadora;

public class Operations extends InitOp {
    private final double number1 = getNumber1();
    private final double number2 = getNumber2();
    public Operations(double number1, double number2) {
        super(number1,number2);
    }
    public double sum(){
        return number1 + number2;
    }
    public  double subtraction(){
        return number1 - number2;
    }
    public double multiplication(){
        return number1 * number2;
    }
    public double division(){
        return number1 / number2;
    }
}
