package poo.heranca;

public class Cachorro extends Animal {

	private String deveCorrer;

	public Cachorro(String nome, int idade) {
		super(nome, idade);

	}
      @Override
	public void som(String barulho) {
		System.out.println(getNome() + " de " + getIdade() + " anos, correndo atrás do motoqueiro..." + barulho);
	} 
      @Override
	public void movimento(String mexer) {
		System.out.println("\n Segue ele Muito veloz..." + mexer);
	}
}
