package projetofinal;

//Projeto Final - M�dulo 1 - Java
//Matheus Passos e Carolina Mira

public class Cliente extends Pessoa {

	public Cliente(String nome, String  cpf, Integer idade) {
		super(nome, cpf, idade);
		this.idade = idade;
		this.nome = nome; 
		this.cpf = cpf;
	}
	
	public void descontoAposentado() {
		if(idade >= 60) {
			System.out.println("O cliente � aposentado! Oferecer desconto.");
		} else {
			System.out.println("O cliente deve pagar os pre�os normais.");
		}

	}
	
	@Override
	public String toString() {
		return "\nCliente -> Nome: " + this.nome + ", CPF: " + this.cpf + ", Idade: " + this.idade;
	}
	

	//public void checarFidelidade(String cpf1) {
	
		//if(listaclientes.contains(cpfcliente1)){
		//System.out.println("Ol� caro cliente! Aqui est� sua lista de produtos com desconto. Aproveite!");
			//}
		//else{ System.out.println("O cliente ainda n�o est� cadastrado na loja. Procure um de nossos funcion�rios.");
	//  }
}


	

