package PacoteJava;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int segTotal,seg,h,min;
		System.out.println("Entre com o tempo de duração em segundos: ");
		segTotal = ler.nextInt();
		h = segTotal/3600;
		min = (segTotal%3600)/60;
		seg = (segTotal%3600)%60;
		System.out.println("Horas: ");
		System.out.println(h);
		System.out.println("Minutos: ");
		System.out.println(min);
		System.out.println("Segundos: ");
		System.out.println(seg);
	}
}
