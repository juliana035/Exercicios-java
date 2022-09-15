package heranca;

public class Preguica extends Animal {

	private String subirArvore;

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
    @Override
	public void som(String barulho) {
		System.out.println(getNome() + " de " + getIdade() + " Anos, Preguicinha Gritando" + barulho);

	}
    @Override
	public void movimento(String mexer) {
		System.out.println("\n Subindo lentamente na arvore " + mexer);
	}

}