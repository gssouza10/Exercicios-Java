package Exercicios;

import java.util.*;

public class Exercicio2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Entre com o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if(n1<=n2 && n2<=n3)
		{
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}
		else if(n1<=n3 && n3<=n2)
		{
			System.out.println(n1);
			System.out.println(n3);
			System.out.println(n2);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.println(n2);
			System.out.println(n1);
			System.out.println(n3);
		}
		else if(n2<=n3 && n3<=n1)
		{
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
		}
		else if (n3<=n1 && n1<=n2)
		{
			System.out.println(n3);
			System.out.println(n1);
			System.out.println(n2);
		}
		else
			{
				System.out.println(n3);
				System.out.println(n2);
				System.out.println(n1);
			}
	}
}
