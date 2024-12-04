public class NewClass {
    public static void main(String[] args) {
        int a = 47, b = -47;
        
        // Primer if que compara si a es mayor o igual que b
        if (a >= b) { 
            System.out.println("voy a preguntar");
            
            // Segundo if que compara si b es igual a a
            if (b == a) {
                System.out.println("igual");
            } else {
                System.out.println("b");
            }
        } else { 
            System.out.println("a");
        }
        
        System.out.println("hola");
        System.out.println("fin del programa");
    }
}
