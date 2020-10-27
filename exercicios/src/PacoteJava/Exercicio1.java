package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias,somaDias;
		System.out.println("Entre com sua idade em anos: ");
		anos = ler.nextInt();
		System.out.println("Entre com sua idade em meses: ");
		meses = ler.nextInt();
		System.out.println("Entre com sua idade em dias: ");
		dias = ler.nextInt();
		somaDias = (anos*365)+(meses*30)+dias;
		System.out.println("Sua idade total em dias é de: ");
		System.out.println(somaDias);
		
	}
	
}
