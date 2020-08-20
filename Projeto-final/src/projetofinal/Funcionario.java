package projetofinal;

//Projeto Final - Módulo 1 - Java
//Matheus Passos e Carolina Mira

public class Funcionario extends Pessoa {

	private String registroF;
	public Funcionario(String nome, String cpf, Integer idade, String registroF) {
		super(nome, cpf, idade);
		this.idade = idade;
		this.nome = nome; 
		this.cpf = cpf;
		this.registroF = registroF;
	}
	public String getRegistroF() {
		return registroF;
	}
	public void setRegistroF(String registroF) {
		this.registroF = registroF;
	}

}
