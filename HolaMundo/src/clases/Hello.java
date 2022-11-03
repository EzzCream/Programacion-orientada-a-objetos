package clases;

public class Hello {
    private final String number;

    public Hello(String name){
        this.number = name;
    }
    public void greeting(){
        System.out.println("Hi " + number);
    }
}
