package Exercicios;

import java.util.*;

public class Exercicio4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n,nquadrado;
		float nraiz;
		System.out.println("Entre com algum n�mero: ");
		n = ler.nextInt();
		nquadrado= n*n;
		nraiz= (float)Math.sqrt(n);
		if(n%2==0)
		{
			System.out.println("N�mero par... ");
			System.out.println("A raiz quadrada �: "+nraiz);
		}
		else
		{
			System.out.println("N�mero impar... ");
			System.out.println("N�mero ao quadrado: "+nquadrado);
		}
			
	}
}
