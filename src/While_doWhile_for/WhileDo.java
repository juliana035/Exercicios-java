package While_doWhile_for;

import java.util.Scanner;

public class WhileDo {

	public static void main(String[] args) {
		
		int numero, somanum=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\n Digite um Número:");
			numero = ler.nextInt(); 
			somanum = somanum + numero;
		}
		
		while (numero!=0);
		{
			System.out.println("\n As Somas dos Números digitados são:"+somanum);
			
			
			
			
		}

	}

}
