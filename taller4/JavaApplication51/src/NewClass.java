import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
    Scanner usuario = new Scanner(System.in);
    int anioactual;
    int anionacimiento;
    int edad;
        System.out.println("Ingrese año actual");
    anioactual =usuario.nextInt();
        System.out.println("Ingrse su año de nacimiento");
    anionacimiento = usuario.nextInt();
    edad = anioactual - anionacimiento;
    
    if(edad >= 18){
        System.out.println("usted es maytor de edad");
        
    } else {
        System.out.println("usted es menor de edad");
    }
        
        System.out.print((edad >= 18) ? "usted es mayor de edad" : "ustes es menor de edad");
    
    }
    
    
}
