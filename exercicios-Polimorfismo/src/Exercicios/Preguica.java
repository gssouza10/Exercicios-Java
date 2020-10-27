package Exercicios;

public class Preguica extends Animal {
	private String hab2;
	
	public Preguica()
	{
		
	}

	
	public String getHab2() {
		return hab2;
	}


	public void setHab2(String hab2) {
		this.hab2 = hab2;
	}


	public String getNome()
	{
		return "Preguiça:"+"Nome do animal:"+super.getNome() +" - Idade:"+super.getIdade()+"anos"+" - Som:"+super.getSom()+" - Habilidade: "+this.getHab2();
	}
}


