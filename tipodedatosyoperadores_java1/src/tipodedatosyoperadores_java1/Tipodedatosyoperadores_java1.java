package tipodedatosyoperadores_java1;

public class Tipodedatosyoperadores_java1 {

    public static void main(String[] args) {
    int a, b, c;
    a = 10;
    b = 4;
    a = a % 3;
        System.out.println(a);
        
    char inicial = 'd';
        System.out.println("inicial = " + inicial);
        
        
     String nombreEst;
     nombreEst = "David Merino";
        System.out.println("nombreEst = " + nombreEst);
     
     boolean x, y, z;
     x = false;
     y = true;
     z = true;
     
     z= a > b;
        System.out.println("z = " + z);
     z = x && y;
        System.out.println("z = " + z);
        
     z = !(x && y);
        System.out.println("z = " + z);
   z=(! x && y);
        System.out.println("z = " + z);
        
    z = (x && !y);
        System.out.println("z = " + z);
    z = (x || !y);
        System.out.println("z = " + z);
        
    z = (!x || y);
        System.out.println("z = " + z);
    
        
    double numerador, denominador, resta;
    boolean respuesta, respuesta2;
    numerador = 2 * Math.sqrt(16);
    denominador = 1 + 4;
    resta = Math.pow(10, 3) - 2;
    respuesta = (numerador / denominador)>= resta;
        System.out.println("respuesta = " + respuesta);
    
    respuesta2 = (2<=(2/4))  && ((Math.pow(2, 2)  -1000)>125);
    System.out.println("respuesta2 = " + respuesta2);
        
    
    
    
      
        
    
        
        
    
    }
    
}
