package ListaDeExercicios;

import java.util.Scanner;

public class Ex3 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int idade,tmenor21=0,tmaior50=0;
		System.out.printf("Quando quiser finalizar o programa digite: -99 ");
		System.out.printf("\nEntre com a sua idade: ");
		idade = entrada.nextInt();
		
		while(idade!=-99)
		{
			System.out.printf("\nEntre com a sua idade: ");
			idade = entrada.nextInt();

			if(idade<21)
			{
				tmenor21++;
				
			}
			if(idade>50)
			{
				tmaior50++;
				
			}
		}
		System.out.printf("\nTotal de idade menor que 21 anos: %d ",tmenor21);
		System.out.printf("\nTotal de idade maior que 50 anos: %d ",tmaior50);
	}
}