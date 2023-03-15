import java.util.Scanner;
public class Par_ou_impar {

    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);

        int numero;
        String resp;

        do { 
            System.out.println("Digite o número para verificarmos \nse ele é impar ou par: ");

            numero = scan.nextInt();
                if (numero % 2 == 0) {
                    System.out.println("Esse número é par");
                } else{
                    System.out.println("Esse número é ímpar");
        }

            
            System.out.println("Gostaria de continuar \ncom outro número? S/N?");
                
                resp = scan.next();

        }while(resp.equals ("S") || resp.equals ("s") );

    }
    
}
