package Exercicios;

public class Cachorro extends Animal{
	private String hab;
	
	public Cachorro()
	{
		
	}
	
	
	public String getHab() {
		return hab;
	}


	public void setHab(String hab) {
		this.hab = hab;
	}


	public String getNome()
	{
		return "Cachorro:"+"Nome do animal:"+super.getNome()+" - Idade:"+super.getIdade()+"anos"+" - Som:"+super.getSom()+" - Habilidade:"+this.getHab();
	}
}
