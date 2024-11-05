import java.util.Scanner;
public class ejercicio7 {
 public static void main(String[] args) {
 double costo_kilovatio, kilovatios_consumidos, valor_base, valor_final;
 int edad;
 Scanner usuario = new Scanner (System.in);
     System.out.println("Ingrese costo kilovatio/hora");
     costo_kilovatio = usuario.nextDouble();
     System.out.println("Ingrese el numero de kilovatios consumidos");
     kilovatios_consumidos = usuario.nextDouble();
     System.out.println("Ingrese su edad");
     edad = usuario.nextInt();
     
    valor_base = costo_kilovatio * kilovatios_consumidos;
    valor_final = valor_base * (edad > 65 ? 0.9 :1.0);
     System.out.println("El valor a cancelar en la planilla de luz es" + valor_final);
     
     
     
    }
       
}
/***
Ingrese costo kilovatio/hora
*55
Ingrese el numero de kilovatios consumidos
*670
Ingrese su edad
*67
El valor a cancelar en la planilla de luz es33165.0
 */
