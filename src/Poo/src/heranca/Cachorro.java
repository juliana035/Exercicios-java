package heranca;

public class Cachorro extends Animal {
    
	        private String deveCorrer;
	        
	       public Cachorro (String nome,int idade,String emitirSom,String deveCorrer) {
	    	  super (nome,idade,emitirSom);
	    	  
	    	  this.deveCorrer = deveCorrer;
	       }

		public String getDeveCorrer() {
			return deveCorrer;
		}

		public void setDeveCorrer(String deveCorrer) {
			this.deveCorrer = deveCorrer;
		}
		
	       public void imprimirInfo() {
	       System.out.println("\n Nome do Cachorro: "+getNome()+"\nIdade: "+getIdade()+"\nEmitir o som: "+getEmitirSom()+
	    		   "\n O que ele  faz?  "+deveCorrer);
	    	
	       }
	       
	       public void emitirLatido() {
	       System.out.println("\n Au-Au-Au");
}    
	       public void correDoguinho() {
	       System.out.println("\n Cachorro correndo atrás do motoqueiro");	   
	       }
              
	       				
}


	       
