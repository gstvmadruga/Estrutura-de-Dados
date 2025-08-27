package dominio;

public class Animal {
	private String nome, especie, raca;

	public Animal(String nome, String especie, String raca) {
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}   
}

