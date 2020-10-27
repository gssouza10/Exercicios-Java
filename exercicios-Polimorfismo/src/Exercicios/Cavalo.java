package Exercicios;

public class Cavalo extends Animal{
	private String hab1;
	public Cavalo()
	{
		
	}
	
	
	public String getHab1() {
		return hab1;
	}


	public void setHab1(String hab1) {
		this.hab1 = hab1;
	}


	public String getNome()
	{
		return "Cavalo:"+"Nome do animal:"+super.getNome() +" - Idade:"+super.getIdade()+"anos"+" - Som:"+super.getSom()+" - Habilidade:"+this.getHab1();
	}
}
