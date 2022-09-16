package poo.heranca;

public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro doguinho = new Cachorro("Barto", 2);
		Cavalo fogo = new Cavalo("\nSpirit", 5);
		Preguica dorminhoca = new Preguica("\nJuliana", 35);

		doguinho.som("\n Au - Au - Au...");
		doguinho.movimento("\n atrás do motoqueiro!!!");
		fogo.som("\n hiiionnnnn");
		fogo.movimento("\n Spirit Surpreendendo com sua velocidade...");
		dorminhoca.som("\n ihiiihihihihihi ");
		dorminhoca.movimento("\n Com seus olhinhos fechando!!!");

	}
}