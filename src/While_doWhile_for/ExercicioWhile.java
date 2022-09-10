package While_doWhile_for;

import java.util.Scanner;

/*  Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class ExercicioWhile {

	public static void main(String[] args) {
		 
		int idade = 0,Contmenorde=0,Contmaiorde=0;
		
		Scanner ler = new Scanner(System.in);
	
		System.out.println("\n Entre com sua idade:");
		 idade = ler.nextInt();

		while(idade!= -99) {	
	
        if(idade <21) {
        	Contmenorde++;       	   	
        }if(idade>51) {  
        	 Contmaiorde++;        	 
         }
         System.out.println("\n Entre com sua idade:");
		 idade = ler.nextInt();     
		}
	   System.out.println("\n Pessoas menor de 21 anos:"+Contmenorde);
       System.out.println("\n Pessoas menor de 50 anos:"+Contmaiorde);
	}
	
}
	
