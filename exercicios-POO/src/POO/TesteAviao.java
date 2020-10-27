package POO;

public class TesteAviao {
	public static void main (String args[]) 
	{
		Aviao oAviao = new Aviao();
		oAviao.cor = "Azul";
		oAviao.modelo = "Boeing 737-400F";
		oAviao.velocidadeAtual =  0;
		oAviao.velocidadeMaxima = 900;
		
		oAviao.liga();
		
		oAviao.acelera(300);
		System.out.println(oAviao.velocidadeAtual);
		oAviao.velocidade();
	}
}
