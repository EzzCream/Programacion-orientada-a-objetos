import calculadora.Operations;

public class Main {
    public static void main(String[] args) {
        Operations calculator = new Operations(4,2);
        double num1 = calculator.getNumber1();
        double num2 = calculator.getNumber2();
        double sum = calculator.sum();
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + sum);
        double res = calculator.subtraction();
        System.out.println("La resta de " + num1 + " - " + num2 + " = " + res);
        double mul = calculator.multiplication();
        System.out.println("La multiplicacion de " + num1 + " * " + num2 + " = " + mul);
        double div = calculator.division();
        System.out.println("La division de " + num1 + " / " + num2 + " = " + div);
        double resi = calculator.residuo();
        System.out.println("El residuo de "  + num1 + " % " + num2 + " = " + resi);
    }
}