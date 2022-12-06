public class Main {
    public static void main(String[] args) {
        double num = 5.234;
        String num2 = num +"";
        String[] num3 = num2.split("\\.");
        System.out.println(num3[1]);
        if(num3[1].length() >= 4){
            System.out.println("El valor tiene 4 decimales");
        }else{
            System.out.println("El valor tiene 2 decimales");
        }
    }
}