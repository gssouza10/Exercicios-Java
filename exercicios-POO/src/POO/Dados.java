package POO;

public class Dados {
	public static void main (String args[])
	{
		Cliente cliente1 = new Cliente("Caio","\n18 anos","\nRG: 20.424.875-1");
		System.out.println(cliente1.getDados());
	}
}
