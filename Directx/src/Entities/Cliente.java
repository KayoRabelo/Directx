package Entities;

public class Cliente {
	
	private static int counter =1;
	
	private String nome; 

	
	public Cliente() {
		
		
		
	}
	
	public Cliente(String nome) {
		
		this.nome = nome;
	   
		counter += 1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String toString() {
		return "\nNome: " + this.getNome() ;
				
	}
	
	
}



