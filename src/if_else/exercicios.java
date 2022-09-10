package if_else;

import java.util.Scanner;

public class exercicios {
	public static void main(String[] args){
	  
	
	int n1,n2,n3,numero=0;
	
	
			
	Scanner leia = new Scanner(System.in);
	 System.out.println("\nentre com primeiro numero:");
	    n1 = leia.nextInt();
	    
	    System.out.println("\n entre com o segunda numero:");
        n2 = leia.nextInt();
      
        System.out.println("\n entre com o terceiro numero:");
       n3 = leia.nextInt();
      
       numero=0; 
       
       if (n1>= numero) {
      numero=n1;}
       if (n2>= numero) {
       numero=n2;}
       if (n3>= numero) {
    	   numero=n3;}
       System.out.println("\n número maior:"+ numero);
}
}