package ListaDeExercicios;

import java.util.Scanner;

public class Ex5 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int num,soma=0;
		System.out.printf("Entre com um número: ");
		num = entrada.nextInt();
		soma=num+soma;
		
		do
		{
			System.out.printf("Entre com um número: ");
			num = entrada.nextInt();
			soma=num+soma;
		} while(num>=1);
		{
			
			System.out.printf("\nSoma total: %d",  soma);
		}
	}
}
