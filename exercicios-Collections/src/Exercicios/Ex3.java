package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
		public static void main(String [] args)
		{ int op;
		Scanner ler = new Scanner(System.in);
		ArrayList estoque = new ArrayList();
		
		do {
			System.out.println("\nDigite uma opção:" );
			System.out.println("\n----------------------------------------");
			System.out.println("\n1-Deseja adicionar produtos ao estoque\n2-Deseja remover\n3-Atualizar\n4-Mostrar todos os produtos do estoque\n0-Encerrar programa");

			System.out.println("\n----------------------------------------");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:

			System.out.print("\nDigite o produto para adicionar ao estoque:");

			String produto = ler.next();
			estoque.add(produto);
			break;

			case 2:

			System.out.println("\nDigite oproduto para remover do estoque: ");

			String produtor = ler.next();
			estoque.remove(produtor);
			break;

			case 3:
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = ler.next();
				System.out.println("\nDigite o nome do produto que entrará no lugar de:"+verifica+"\n");

				String novo = ler.next();

				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				System.out.println(estoque);
				break;

				case 4:

				System.out.println("\nOs produto do estoque: ");

				System.out.println(estoque);
				break;

				default:
					System.out.println("\nFinalizou o programa!!!");

					}

					}while(op !=0);
		}
}