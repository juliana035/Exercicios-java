package heranca;

public class Cavalo extends Animal {

	private String deveCorrer;

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
    @Override
	public void som(String barulho) {
		System.out.println(getNome() + " de " + getIdade() + " Anos, Segue na liderança da competição.." + barulho);

	}
    @Override 
	public void movimento(String mexer) {
		System.out.println("\n Pocotó pocotó pocotó..." + mexer);
	}

}
