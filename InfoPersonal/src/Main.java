import clases.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(
                "Oscar Antonio",
                "Rodriguez Carmona",
                21,
                "single",
                "play video-games");

        persona.info();
    }
}