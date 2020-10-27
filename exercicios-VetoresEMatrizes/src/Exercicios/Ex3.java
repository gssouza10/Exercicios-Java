package Exercicios;

import java.util.Scanner;
public class Ex3 {
	public static void main(String[]args) {
	Scanner entrada = new Scanner(System.in);
	int matriz[][] = new int[3][3];
    int l,c,cont = 0;

    for (l=0;l<3;l++) {
        for (c=0;c<3;c++) {

            System.out.print("Insira a posição [" + l + "][" + c + "]: ");
            matriz[l][c]=entrada.nextInt();
            
            if (matriz[l][c] > 10) {
                cont += 1;

            }
        }
    }
    System.out.println("A matriz possui " + cont + " valores maiores do que DEZ.");
	}
}

