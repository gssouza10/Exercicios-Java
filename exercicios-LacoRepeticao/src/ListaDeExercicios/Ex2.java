package ListaDeExercicios;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] argss){
        Scanner entrada = new Scanner(System.in);
        int num, p = 0, i = 0;
        
        for(int x = 1; x <= 10; x++){
            System.out.println("Digite o " + x + "� n�mero");
            num = entrada.nextInt();
            
            if(num % 2 == 0){
                p++;
            }
            else
            {
            	i++;
            }
        }
        System.out.println("Foram digitados " + p + " n�meros pares \n");
        System.out.println("e " + i + " n�meros �mpares");
	}
}
