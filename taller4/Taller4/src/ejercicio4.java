import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        double costo_minutos, costo_planilla;
        int minutos_consumidos_mes;
        Scanner usuario = new Scanner(System.in);
        System.out.println("ingrese el costo por minutos");
        costo_minutos = usuario.nextDouble();
        System.out.println("ingrese minutos consumidos en en el mes");
        minutos_consumidos_mes = usuario.nextInt();
        costo_planilla = (costo_minutos * minutos_consumidos_mes);
        System.out.println("el costo de la planilla es = " + costo_planilla);
        
        
        
    }
    
}
/***
ingrese el costo por minutos
*2.40
ingrese minutos consumidos en en el mes
*67
el costo de la planilla es = 
*160.79999999999998
 */