package Exercicios;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		int a[]= {1,0,5,-2,-5,7};
		int i;
		
        System.out.printf("%d%d%d\n",a[0],a[1],a[5]);
        a[4] = 100;
        for (i=0;i<6;i++) {
            System.out.printf("%d\n",a[i]);
        }
	}
}