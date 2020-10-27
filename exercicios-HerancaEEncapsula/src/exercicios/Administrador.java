package exercicios;

public class Administrador extends Pessoa{
	private float ajudaDeCusto;
	
	public Administrador (String nome, String endereco, String cpf, int telefone, int idade, float ajudaDeCusto)
	 {
		 super(nome,endereco,cpf,telefone,idade);
		this.ajudaDeCusto = ajudaDeCusto;
	 }
		
	public void imprimirInfo()
	{
	System.out.println("\nNome: "+getNome()+"\n"+"cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+
			"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\n"+"Ajuda de custo de R$: "+ajudaDeCusto);
	}
}
