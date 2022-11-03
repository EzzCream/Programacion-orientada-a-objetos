package clases;

public class Cubo {
    public Cubo(){
        int y = 15;
        for(int x = 0; x<10; x ++){
            int cubo = y * y * y;
            System.out.println(" El cubo de " + y + " es " + cubo);
            y = y + 3;
        }
    }
}
