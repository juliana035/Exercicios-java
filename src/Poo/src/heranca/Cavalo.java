package heranca;

public class Cavalo extends Animal {

	            private String deveCorrer;
	            
	            public Cavalo (String nome,int idade,String emitirSom,String deveCorrer){
	            	super(nome,idade,emitirSom);
	            	
	            	this.setDeveCorrer(deveCorrer);
	            }

				public String getDeveCorrer() {
					return deveCorrer;
				}

				public void setDeveCorrer(String deveCorrer) {
					this.deveCorrer = deveCorrer;
				}
				
				public void imprimirInfo() {
				System.out.println("\nNome Cavalo: "+getNome()+"\n idade: "+getIdade()+"\n Emitir Som: "+getEmitirSom()+
						"\n Cavalo do Pantanal? "+deveCorrer);
				}
             
				public void relinchoCavalo() {
				System.out.println("\n HIIIIIIIIIII");
			}    
			    public void correCavalinho() {
			     System.out.println("\n Correndo com zé Leôncio");	   
				       }
			              
				       				
			}


