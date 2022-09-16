package collections;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

*/
import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsLoja {

	public static void main(String[] args) {
		int op;
		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();

		do {

			
			System.out.println("\n\t\t Bem vindo ao estoque de nossa loja!!!");
			System.out.println("\nVamos para o nosso Menu:");
			System.out.println("\n Digite uma das opções abaixo.");
			System.out.println("\n(1) Você deseja armazenar algum produto:");
			System.out.println("\n(2)Você deseja remover algum produto:");
			System.out.println("\n(3)Você deseja atualizar nosso estoque:");
			System.out.println("\n(4)Você deseja mostrar produtos:");
			System.out.println("\n (0)Para sair do nosso estoque.");
			op = leia.nextInt();
			System.out.println("\n*******//******//****//********//****//");

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o produto para adicionar no estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque: ");
				String produto1 = leia.nextLine();
				if (estoque.contains(produto1)) {
					estoque.remove(produto1);
				} else {
					System.out.println("\nProduto não existe no estoque!!!");
				}
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDeseja atualizar qual produto?");
				String verificar = leia.nextLine();
				System.out.println("\n Nome do produto:" + verificar + ":");
				String novo = leia.nextLine();
				if (estoque.contains(verificar)) {
					estoque.remove(verificar);
					estoque.add(novo);

				} else {
					System.out.println("\nProduto não existe no estoque!!!");
				}
				System.out.println(estoque);
				break;

			case 4:
				System.out.println("\n Produtos do estoque: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nObrigado por deixar nosso estoque mais organizado!!");
				break;
			default:
				System.out.println("\nOpção inválida!!!");
			}

		} while (op != 0);
	}

}
