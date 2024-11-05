import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
    double monto_prestamo, pago_mensual , interes_mensual;
    int numero_cuotas = 12;
    Scanner usuario = new Scanner(System.in);
    System.out.println("Ingrese el monto de prestamo");
    monto_prestamo = usuario.nextDouble();
    System.out.println("Ingresa interes mensual");
    interes_mensual = usuario.nextDouble();
    pago_mensual = (monto_prestamo * interes_mensual)/ (1 -Math.pow(interes_mensual,- numero_cuotas));
        System.out.println("El pago mensual por el prestamo es :" + pago_mensual);
    }
    
}
/***
Ingrese el monto de prestamo
* 100
Ingresa interes mensual
* 7
El pago mensual por el prestamo es :
*700.0000000505734
 */
