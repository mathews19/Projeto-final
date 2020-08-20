package projetofinal;

//Projeto Final - Módulo 1 - Java
//Matheus Passos e Carolina Mira

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Farmacia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		// Criação da Lista de Clientes
		List<Cliente> listaclientes = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("João da Silva", "847.583.886-98", 34);
		Cliente cliente2 = new Cliente("A", "834.567.878-23", 65);
		Cliente cliente3 = new Cliente("Lucas Silva", "745.293.094-98", 18);
		Cliente cliente4 = new Cliente("Luis Guerreiro", "263.128.092-73", 29);
		Cliente cliente5 = new Cliente("Paula Figueiredo", "374.100.253-43", 34);

		listaclientes.add(cliente1);
		listaclientes.add(cliente2);
		listaclientes.add(cliente3);
		listaclientes.add(cliente4);
		listaclientes.add(cliente5);

		// Criação da Lista de Produtos
		Collection<String> listaprodutos = new ArrayList<String>();
		listaprodutos.add("Pasta de dente");
		listaprodutos.add("Neosaldina");
		listaprodutos.add("Engov");
		listaprodutos.add("Novalgina");
		listaprodutos.add("Buscopan");
		
		// Criação da Lista de Admin
		List<Administrador> listaadmin = new ArrayList<Administrador>();
		Administrador admin1 = new Administrador("Caroline Crisel", "234.583.886-98", 25, "45999");
		Administrador admin2 = new Administrador("Matheus Passos", "847.583.654-98", 17, "12345");
		Administrador admin3 = new Administrador("Carolina Mira", "847.345.886-98", 65, "67895");
		
		listaadmin.add(admin1);
		listaadmin.add(admin2);
		listaadmin.add(admin3);
		
		// Criação da Lista de Funcionarios
		List<Funcionario> listafunc = new ArrayList<Funcionario>();
		Funcionario func1 = new Funcionario("Bruno Profeta", "234.583.886-98", 43, "33444");
		Funcionario func2 = new Funcionario("Alex Cesar", "375.583.886-54", 20, "35732");
		Funcionario func3 = new Funcionario("Sofia Fernandes", "233.234.856-11", 30, "34112");
		
		listafunc.add(func1);
		listafunc.add(func2);
		listafunc.add(func3);
		
		//Identificação Admin ou Funcionário
		
		System.out.println("Digite 1 para Funcionário ou 2 para Administrador: ");
		Integer op = Integer.valueOf(entrada.nextLine());
		
		switch(op) {
		
		case 1:
		System.out.println("Digite seu número de registro: ");
		String registro = entrada.nextLine();
	
			if(func1.getRegistroF().equals(registro)) {
			    System.out.println("Seja bem vindo(a) Funcionário(a) " + func1.getNome());	
				} else if(func2.getRegistroF().equals(registro)) {
				 System.out.println("Seja bem vindo(a) Funcionário(a) " + func2.getNome());
			} else if (func3.getRegistroF().equals(registro)) {
				System.out.println("Seja bem vindo(a) Funcionário(a) " + func3.getNome());
			} else {
				System.out.println("Seu registro não está cadastrado. Procure o gerente.");
		}
	

		break;
		
		case 2: 
			System.out.println("Digite seu número de registro: ");
			String registro2 = entrada.nextLine();
			
				if(admin1.getRegistroA().equals(registro2)) {
					System.out.println("Seja bem vindo(a) Administrador " + admin1.getNome());	
					
					} else if(admin2.getRegistroA().equals(registro2)) {
					 System.out.println("Seja bem vindo(a) Administrador " + admin2.getNome());
				} else if (admin3.getRegistroA().equals(registro2)) {
					System.out.println("Seja bem vindo(a) Administrador " + admin3.getNome());
				} else {
					System.out.println("Seu registro não está cadastrado. Procure o gerente.");
			}
		
		break;
		
		default:
		System.out.println("Opção inválida! Digite nova opção.");
		break;
		
		}
		
		System.out.println(
				"**Sistema - Farmácia**\nDigite a opção desejada: \n1 -- Exibir produtos\n2 -- Exibir clientes\n3 -- Adicionar produto ao estoque\n4 -- Cadastrar cliente\n5 -- Remover produto do estoque\n6 -- Remover cadastro do cliente\n7 -- Consultar desconto ");
		Integer opcao = Integer.valueOf(entrada.nextLine());
		
		switch (opcao) {

		case 1: // Exibir produtos
			System.out.println(listaprodutos);
			break;

		case 2: // Exibir clientes
			System.out.println(listaclientes);
			break;

		case 3: // Adicionar produto ao estoque
			System.out.println("Digite o produto a ser adicionado: ");
			String adicao = entrada.next();
			listaprodutos.add(adicao);
			System.out.println("O produto " + adicao + " foi colocado no estoque.");
			System.out.println("Estoque atual: " + listaprodutos);
			break;

		case 4: // Cadastrar clientes

			Cliente clientex = new Cliente("A", "B", 0);
			System.out.println("Digite o nome do cliente: ");
			clientex.setNome(entrada.nextLine());
			System.out.println("Digite o CPF do cliente: ");
			clientex.setcpf(entrada.next());
			;
			System.out.println("Digite a idade do cliente: ");
			clientex.setIdade(entrada.nextInt());
			listaclientes.add(clientex);
			System.out.println(listaclientes);
		
			break;

		case 5: // Remover produto do estoque
			System.out.println("Digite o nome do produto: ");
			String retirar = entrada.next();
			if (listaprodutos.contains(retirar)) {
				listaprodutos.remove(retirar);
				System.out.println("Produto " + retirar + " retirado para venda!");
				System.out.println("Estoque atual: " + listaprodutos);
			} else {
				System.out.println("Este produto acabou. Consulte o estoque na opção 1.");
			}
			break;

		/*case 6: // Remover cadastro do cliente
			System.out.println(listaclientes);
			Cliente cliente = new Cliente("a", "b", 0);
			System.out.println("Digite o nome do cliente: ");
			cliente.setNome(entrada.nextLine());
			System.out.println("Digite o CPF do cliente: ");
			cliente.setcpf(entrada.next());
			System.out.println("Digite a idade do cliente: ");
			cliente.setIdade(entrada.nextInt());
			System.out.println(cliente);
			System.out.println(listaclientes.contains(cliente));		
			
			if (listaclientes.contains(cliente) == true) {
				listaclientes.remove(cliente);
				System.out.println(listaclientes);break;*/

			case 7: // Consultar desconto
			Cliente cliente = new Cliente("A", "B", 0);
			System.out.println("Digite o nome do cliente: ");
			cliente.setNome(entrada.nextLine());
			System.out.println("Digite o CPF do cliente: ");
			cliente.setcpf(entrada.next());
			System.out.println("Digite a idade do cliente: ");
			cliente.setIdade(entrada.nextInt());
			System.out.println(cliente);
			cliente.descontoAposentado();
			break;


			default:
			System.out.println("Opção inválida!");	
			break;
			
			}
		entrada.close();
		}
	}