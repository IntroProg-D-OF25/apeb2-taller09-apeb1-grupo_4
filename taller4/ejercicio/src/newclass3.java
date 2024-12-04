import java.util.Scanner;
public class newclass3 {
    public static void main(String[] args) {
        int numdia;
        Scanner tcl = new Scanner(System.in);
        System.out.println("dame numero de dia");
        numdia = tcl.nextInt();
        //esctrucutura de control selctiva multiple 
        switch(numdia)
       {//inicio del "segun sea" <==> switch
            case 1: System.out.println("lunes");
                  break;
            case 2: System.out.println("martes");
                  break;
            case 3: System.out.println("miercoles");
                  break;
            default: System.out.println("error numero");        
        }//inicio del "segun sea" <==> switch          
            
    }
    
}
