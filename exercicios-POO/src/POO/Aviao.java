package POO;

public class Aviao {
	 String cor;
	 String modelo;
	 double velocidadeAtual;
	 double velocidadeMaxima;
	 
	 void liga()
	 {
		 System.out.println("O avi�o est� ligado...");
	 }
	 void acelera(double quantidade)
	 {
		 double velocidadeNova = this.velocidadeAtual + quantidade;
		 this.velocidadeAtual = velocidadeNova;
	 }
	  void velocidade()
	 {
		 if(this.velocidadeAtual<=0)
		 {
			 System.out.println("Avi�o ainda n�o decolou");
		 }
		 else if(this.velocidadeAtual>0 &&this.velocidadeAtual<=300)
		 {
			 System.out.println("Em velocidade de decolagem");
		 }
		 else
		 {
			 System.out.println("Est� voando");
		 }

	 }
}
