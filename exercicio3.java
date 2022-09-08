package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int idades;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n entre com sua idade:");
		idades=leia.nextInt();
		
		if(idades<=10) {
        System.out.println("\n Você não se enquadra na categoria!!!");
	}
       if(idades>=10 && idades<=14) {
       System.out.println("\n Você  se enquadra na categoria infantil!!!");
       }
       if(idades>=15 && idades<=17) {
       System.out.println("\n Você  se enquadra na categoria Juvenil!!!");
           }
       if(idades>=18 && idades<=25) {
           System.out.println("\n Você  se enquadra na categoria Adulto!!!");
       }
	 if(idades>=26){
      System.out.println("\n você não esta dentro das categorias!!!");
	 }
	}
}

	
