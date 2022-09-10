package While_doWhile_for;
import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */
public class RepetiçãoFor {

	public static void main(String[] args) {

		int x, contpar = 0, contImpar = 0, numero;

		Scanner leia = new Scanner(System.in);

		for (x = 1; x <= 10; x++) {
			System.out.println("\n Entre com número:");
			numero = leia.nextInt();

			if (x % 2 == 0) {
				contpar++;
			} else {
				contImpar++;
			}

		}
		System.out.println("\n numeros pares," + contpar);
		System.out.println("\n numeros impares," + contImpar);

	}
}
