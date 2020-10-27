package Exercicios;

public class TestePolimorfismoAnimais {
	public static void main (String args[])
	{
		Cachorro dog = new Cachorro();
		dog.setNome("Spyke");
		dog.setIdade(12);
		dog.setSom("Au Au Au");
		dog.setHab("Correr");

		Cavalo horse = new Cavalo();
		horse.setNome("Bala no Alvo");
		horse.setIdade(20);
		horse.setSom("uuh uuh");
		horse.setHab1("Correr");
		
		Preguica sloth = new Preguica();
		sloth.setNome("Toby");
		sloth.setIdade(2);
		sloth.setSom("hiiiiiiiii");
		sloth.setHab2("Subir em árvores");
		
		Animal[] animais = new Animal[3];
		animais[0]=dog;
		animais[1]=horse;
		animais[2]=sloth;
		
		for(Animal animal:animais)
		{
			System.out.println(animal.getNome());
		}
	}
}
