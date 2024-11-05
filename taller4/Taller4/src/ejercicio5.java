import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
   int costo_cpu, costo_teclado, costo_pantalla, costo_raton, costo_total;
   Scanner usuario = new Scanner(System.in);
        System.out.println("Ingrese costo cpu");
        costo_cpu = usuario.nextInt();
        System.out.println("Ingrese costo teclado");
        costo_teclado = usuario.nextInt();
        System.out.println("Ingrese costo pantalla");
        costo_pantalla = usuario.nextInt();
        System.out.println("Ingrese costo raton");
        costo_raton = usuario.nextInt();
        costo_total = costo_cpu + costo_teclado + costo_pantalla +costo_raton;
        System.out.println("costo total es = " + costo_total);
    }
  
}
/***
Ingrese costo cpu
*40
Ingrese costo teclado
*25
Ingrese costo pantalla
*10
Ingrese costo raton
*5
costo total es = 80
 */