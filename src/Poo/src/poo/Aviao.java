package poo;
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Aviao {
          
	              private String nomePassageiro;	
	              private String destino;
	              private String nomePiloto;
	              private int quantidadedePassageiros;
	              
	              public Aviao(String nomePassageiro,String destino,String nomePiloto,int quantidadedePassageiros) {
	            	  
	            	  this.nomePassageiro = nomePassageiro;
	            	  this.destino = destino;
	            	  this.nomePiloto = nomePiloto;
	            	  this.quantidadedePassageiros = quantidadedePassageiros;
	              }

				public String getNomePassageiro() {
					return nomePassageiro;
				}

				public void setNomePassageiro(String nomePassageiro) {
					this.nomePassageiro = nomePassageiro;
				}

				public String getDestino() {
					return destino;
				}

				public void setDestino(String destino) {
					this.destino = destino;
				}

				public String getNomePiloto() {
					return nomePiloto;
				}

				public void setNomePiloto(String nomePiloto) {
					this.nomePiloto = nomePiloto;
				}

				public int getQuantidadedePassageiros() {
					return quantidadedePassageiros;
				}

				public void setQuantidadedePassageiros(int quantidadedePassageiros) {
					this.quantidadedePassageiros = quantidadedePassageiros;
				}
	              
	                         public void imprimirInfo() {
	                        	 System.out.println("\nNome:"+nomePassageiro+"\nDestino:"+destino+"\nNome do Piloto:"+nomePiloto+"\nQuantidade de Passageiros:"+quantidadedePassageiros);
	                         }
	              
}
