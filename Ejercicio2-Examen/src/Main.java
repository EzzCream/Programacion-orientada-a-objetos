import clases.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(
                "Oscar Antonio",
                21,
                "jugar videojuegos",
                "soltero"
        );
        persona.getInfo();
    }
}