package exercicios;

public class Vendedor extends Pessoa{
		private double valorVendas;
		private double comissao;
		public Vendedor(String nome, String endereco, String cpf, int telefone, int idade, double valorVendas,double comissao)
		{
		super(nome,endereco,cpf,telefone,idade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		}
		public void imprimirInfo()
		{
		System.out.println("\nNome do empregado: "+getNome()+"\n"+"cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+
				"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\n"
				+"\n"+"Valor Vendas: "+valorVendas+"\n"+"Porcentagem (sem '%') da comissão dos artigos: "+comissao);
		
		}
	
		public void calcularValorVendas() {
		double valor_total = valorVendas +

		(valorVendas*(comissao/100));

		System.out.println("\nO valor total a ser recebido pelo vendedor: "
				+getNome()+" é igual a: "+valor_total);
		}
		public double getValorVendas() {
			return valorVendas;
		}
		public void setValorVendas(double valorVendas) {
			this.valorVendas = valorVendas;
		}
		public double getComissao() {
			return comissao;
		}
		public void setComissao(double comissao) {
			this.comissao = comissao;
		}
		
		


			
}

