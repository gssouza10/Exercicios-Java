package Exercicios;

import java.util.*;

public class Exercicio4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n,nquadrado;
		float nraiz;
		System.out.println("Entre com algum número: ");
		n = ler.nextInt();
		nquadrado= n*n;
		nraiz= (float)Math.sqrt(n);
		if(n%2==0)
		{
			System.out.println("Número par... ");
			System.out.println("A raiz quadrada é: "+nraiz);
		}
		else
		{
			System.out.println("Número impar... ");
			System.out.println("Número ao quadrado: "+nquadrado);
		}
			
	}
}
