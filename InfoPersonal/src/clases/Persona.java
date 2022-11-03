package clases;

public class Persona {
    private final String name;
    private final String lastName;
    private final int age;
    private final String maritalStatus;
    private final String hobbies;

    public Persona(String name, String lastName, int age, String maritalStatus, String hobbie){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.hobbies = hobbie;
    }

    public void info(){
        System.out.println("My complete name is: " + this.name + " " + this.lastName);
        System.out.println("I have: " + this.age + " years old");
        System.out.println("Im " + this.maritalStatus);
        System.out.println("And i " + this.hobbies);
    }

}
