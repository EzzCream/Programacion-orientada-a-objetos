package escuela;

public class Alumno {

    private String boleta;
    private String nombre;
    private String apellido;
    private String sexo;
    private float calIngles;
    private float calMatematicas;
    private float calQuimica;

    public Alumno(String boleta, String nombre, String apellido, String sexo) {
        this.boleta = boleta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public void setCalificaciones(float calIngles,float calMatematicas,float calQuimica) {
        this.calIngles = calIngles;
        this.calMatematicas = calMatematicas;
        this.calQuimica = calQuimica;
    }

    public void getInfoAlumno(){
        System.out.println("Nombre: " + nombre + " " + apellido + " con boleta: " + boleta + " de sexo: " + sexo);
    }
    public String validarEstadoIngreso(){
        if((calIngles + calMatematicas + calQuimica)/3 >= 8){
            return "Aceptado";
        }else{
            return "Rechazado";
        }
    }

}
