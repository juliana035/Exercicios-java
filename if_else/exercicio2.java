package exercicios.if_else;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner ler= new Scanner (System.in);
	
        System.out.println("\n entre com o A:");
        a = ler.nextInt();
        System.out.println("\n entre com o B:");
        b = ler.nextInt();
        System.out.println("\n entre com o C:");
        c = ler.nextInt();
        if(a<=b && b<=c) {
            System.out.println("\nOrdem crescente: "+a+" , "+b+" , e "+c);
        }else if(a<=c && c<=b) {
            System.out.println("\nOrdem crescente: "+a+" , "+c+" , e "+b);
        }else if(b<=a && a<=c) {
            System.out.println("\nOrdem crescente: "+b+" , "+a+" , e "+c);
        }else if(b<=c && c<=a) {
            System.out.println("\nOrdem crescente: "+b+" , "+c+" , e "+a);
        }else if(c<=a && a<=b) {
            System.out.println("\nOrdem crescente: "+c+" , "+a+" , e "+b);
        }else {
            System.out.println("\nOrdem crescente: "+c+" , "+b+" , e "+a);
        }

    }


	
	}


