package heranca;

public class Preguica extends Animal {

	        private String subirArvore;
	        
	        public Preguica(String nome,int idade,String emitirSom, String subirArvore) {
	        super(nome,idade,emitirSom);
	        this.subirArvore = subirArvore;
	       
	        }

			public String getSubirArvore() {
				return subirArvore;
			}

			public void setSubirArvore(String subirArvore) {
				this.subirArvore = subirArvore;
			}
	        
	       public void imprimirInfo() {
	       System.out.println("\n Nome da Preguiça: "+ getNome()+"\n Idade: "+getIdade()+"\n Emitir Som: "+getEmitirSom()+
	    		   "\n O que ela faz? " + subirArvore );
	       }
	       public void roncodaPreguicinha() {
				System.out.println("\n zzzzzzzzzzzzzzzzzzzz");
			}    
			    public void sobePreguicinha() {
			     System.out.println("\n Subindo a árvore pra dormi");	   
				       }
			              
				       				
			}
     


