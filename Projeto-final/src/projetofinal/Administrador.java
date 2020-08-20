package projetofinal;

//Projeto Final - Módulo 1 - Java
//Matheus Passos e Carolina Mira

public class Administrador extends Pessoa {
	
	private String registroA;
	public Administrador(String nome, String cpf, Integer idade, String registroA) {
		super(nome, cpf, idade);
		this.idade = idade;
		this.nome = nome; 
		this.cpf = cpf;
		this.registroA = registroA;
	}
	public String getRegistroA() {
		return registroA;
	}
	public void setRegistroA(String registroA) {
		this.registroA = registroA;
	}
}