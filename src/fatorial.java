import java.util.Scanner;
//Exercício da professora Camilla  -- FATORIAL.
public class fatorial {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);
        int resultado;
        int fatorial = 1;
        int nf;

        System.out.println("Vamos ver o fatorial do número: ");

        nf = scan.nextInt();

        System.out.println (nf + "! = ");
        for (int fator = nf; fator >= 1; fator --) {
            //Parte do calculo fatorial- ex: 6! = 5.4.3.2.1 = 120
            fatorial = fatorial*fator;
            //System.out.print - Não permite que no final pule linha
            System.out.print(fator +".");
        }
            System.out.println(" = " + fatorial);
    }
}

    
    
    

