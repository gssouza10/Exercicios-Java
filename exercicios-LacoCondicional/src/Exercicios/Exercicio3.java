package Exercicios;

import java.util.*;

public class Exercicio3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Voc� � da categoria infantil...");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Voc� � da categoria juvenil...");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Voc� � da categoria adulto...");
		}
		else
		{
			System.out.printf("\nVoc� entrou com uma idade inv�lida...");
		}
	}
}