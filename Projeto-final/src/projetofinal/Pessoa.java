package projetofinal;

//Projeto Final - Módulo 1 - Java
//Matheus Passos e Carolina Mira

public abstract class Pessoa {
	 protected String nome;
	 protected String cpf;
	 protected Integer idade;
	 	 
	public Pessoa (String nome, String cpf, Integer idade)
	 {	 this.nome = nome;
		 this.cpf = cpf;
		 this.idade = idade;
	 }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		if (validarCPF(cpf) == true) {
			this.cpf = cpf;
		}
		else {
			System.out.println("O CPF é inválido. Digite um novo CPF.");
		}
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	private boolean validarCPF(String cpf) {
		  return cpf != null && !cpf.isEmpty() && cpf.length() == 11 || cpf.length() == 14;
		}	
}
