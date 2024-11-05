import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
 double ancho_rectangulo, largo_rectangulo, area_poligono;
    Scanner teclado = new Scanner(System.in);  

    System.out.println("Ingresa el ancho del rectángulo:");
    ancho_rectangulo = teclado.nextDouble();
        
    System.out.println("Ingresa el largo del rectángulo:");
    largo_rectangulo = teclado.nextDouble();

    area_poligono = (((ancho_rectangulo * largo_rectangulo) / 2) * 3) 
                      + (ancho_rectangulo * ancho_rectangulo) 
                      + (ancho_rectangulo * largo_rectangulo);
        
        System.out.println("El área del polígono es: " + area_poligono);
}
    
}
/***
Ingresa el ancho del rect�ngulo:
*6
Ingresa el largo del rect�ngulo:
*8
El �rea del pol�gono es: 
* 156.0
 */
