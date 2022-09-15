package Poo.src.poo;
/* Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Cliente {
	
	private String nomeCliente;
	private String endereço;
	private String  cpf;
	private String datadeNascimento;
	
	public Cliente(String nomeCliente,String endereço,String cpf,String datadeNascimento) {
		
		        this.nomeCliente = nomeCliente;
		        this.endereço = endereço;
		        this.cpf = cpf;
		        this.datadeNascimento = datadeNascimento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String  getDatadeNascimento() {
		return datadeNascimento;
	}

	public void setDatadeNascimento(String  datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}
	      public void imprimirInfo(){
	    	
			System.out.println("\nNome:"+ nomeCliente + "\nEndereço:"+ endereço+ "\nCPF:"+cpf+"\nData de Nascimento:"+datadeNascimento);
	      }

}
