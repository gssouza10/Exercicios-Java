package POO;

public class Cliente {
	private String clienteNome;
	private String clienteIdade;
	private String clienteRg;
	
	public Cliente (String nome, String idade, String rg)
	{
		clienteNome = nome;
		clienteIdade = idade;
		clienteRg = rg;
	}
	public String getDados()
	{
		String dados = clienteNome+ " "+clienteIdade+" "+clienteRg;
		return dados;
	}
}
