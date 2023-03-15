import java.util.Scanner;


public class PrimerioExercicio {
    public static void main (String[] args) {

        int n1;
        
        int resultado;
        String res;
        Scanner scan = new Scanner (System.in);
        
        
        do {
            System.out.println("Vamos ver a tabuada de qual número? ");
            int count = 1;
            n1 = scan.nextInt();
            if (n1>=1 && n1<=10) {

                while (count<11){
            
                    resultado = n1 * count;

                    

                    System.out.println(n1 +" x " + count + " = " + resultado);
                    
                    count = count+1;
            }
                }else {
                System.out.println("Número inválido");
            }
        
        System.out.println("Gostaria de colocar outro número? S/N ");
    
        res = scan.next();
        
        } while (res.equals ("s") || res.equals ("S"));

    }
}

   