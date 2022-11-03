package clases;

public class Multiplication {

    private final int number;
    private final int times;
    public Multiplication(int number, int times){
        this.number = number;
        this.times = times;
    }
    public void operation(){
        for(int x = 0; x< times; x++){
            int Mul = number * x;
            System.out.println(number + " x " + x + " = " + Mul);
        }
    }
}