package While_doWhile_for;

import java.util.Scanner;

/*  Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class RepetiçãoWhile {

	public static void main(String[] args) {
		 
		int idade = 0,Somamenorde=0,Somarmaiorde=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\n Entre com sua idade:");

		while(idade!= -99) {	
			
	}
        if(idade <=21) {
        	Somamenorde += idade;
        	  idade++;
        	  System.out.println("\n entre com sua idade,:"+Somamenorde);
        }
	}	
	
}
