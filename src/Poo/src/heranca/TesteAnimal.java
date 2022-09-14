package heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		
		 Cachorro doguinho = new Cachorro("Barto",2,"Au-Au","correr" );
		 Cavalo poney = new Cavalo("Preto",5,"relinchar","corre");
		 Preguica dorminhoca = new Preguica("Juliana", 35, "ronca","subir na árvore");
		 
		 doguinho.imprimirInfo();
		 doguinho.correDoguinho();
		 doguinho.emitirLatido();
		 poney.imprimirInfo();
	     poney.correCavalinho();
	     poney.relinchoCavalo();
		 dorminhoca.imprimirInfo();
		 dorminhoca.sobePreguicinha();
		 dorminhoca.roncodaPreguicinha();

	}

}
