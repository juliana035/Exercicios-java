package matrizesvetores;

import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
.
*/
public class Vetor {

	public static void main(String[] args) {

		int[] num = new int[6];

		int somaPar = 0, contImpar = 0;

		int x;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 6; x++) {
			System.out.println("\nEntre com o Número:");
			num[x] = leia.nextInt();

			if (num[x] % 2 == 0) {

				somaPar += num[x];

			} else {
				contImpar++;

			}

		}

		System.out.println("\nSoma dos Numeros Pares:" + somaPar);
		System.out.println("\nQuantidade Numeros Impar:" + contImpar);
		System.out.println("\nNúmeros Digitados:");
		int i;
		for (i = 0; i < 6; i++) {
			if (num[i] % 2 != 0) {
				System.out.println("Número Impar:" + num[i]);
			} else {
				System.out.println("Número Par:" + num[i]);
			}
		}
	}
}
