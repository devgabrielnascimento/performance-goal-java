package produto;

import java.util.Scanner;

import produto.controller.ProdutoController;
import produto.model.Bebida;
import produto.model.Comida;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String menu = "|                                   |" + "\n|       BEM-VINDO/A/E A EATMAIS     |"
				+ "\n|                                   |" + "\n|---------------------------------- |"
				+ "\n|              [MENU|               |" + "\n|---------------------------------- |"
				+ "\n| O QUE VOCÊ GOSTARIA DE FAZER?     |" + "\n| [1] CADASTRAR UM PRODUTO          |"
				+ "\n| [2] ATUALIZAR UM PRODUTO          |" + "\n| [3] DELETAR UM PRODUTO            |"
				+ "\n| [4] BUSCAR POR UM PRODUTO         |" + "\n| [5] LISTAR TODOS OS PRODUTOS      |"
				+ "\n| [6] SAIR                          |";

		int opcao, id, categoria;
		String nome, fabricacao, validade, qualidadeComida, infoAlergenico, preparo, teorAlcoolico, sabor,
				tipoRecipiente;
		float preco;
		double volume;

		ProdutoController produtos = new ProdutoController();

		System.out.println(menu);

		while (true) {

			System.out.println(menu);

			opcao = sc.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("Vamos cadastrar um produto!");

				System.out.println("\nOk, para começar, digite o nome desse produto");

				sc.nextLine();
				nome = sc.nextLine();

				System.out.println("Qual a categoria? ");

				categoria = sc.nextInt();

				System.out.println("Data de fabricação? ");
				sc.nextLine();
				fabricacao = sc.nextLine();

				System.out.println("Data de validade? ");
				validade = sc.nextLine();

				System.out.println("Preço? ");

				preco = sc.nextFloat();

				switch (categoria) {
				case 1:
					System.out.println("Qual é a qualidade da comida? ");
					qualidadeComida = sc.nextLine();
					System.out.println("Esse produto é alérgico? ");
					infoAlergenico = sc.nextLine();
					System.out.println("Qual o tipo de preparo? ");
					preparo = sc.nextLine();
					
					produtos.cadastrarProduto(new Comida(produtos.gerarId(), categoria,
							nome, fabricacao, 
							validade, preco, qualidadeComida,
							infoAlergenico, preparo
							));
					break;
					
				case 2:
					
					System.out.println("Qual é o volume dessa bebida? ");
					volume = sc.nextDouble();
					System.out.println("Essa bebida possui álcool? ");
					sc.nextLine();
					teorAlcoolico = sc.nextLine();
					System.out.println("Qual é o sabor? ");
					sabor = sc.nextLine();
					System.out.println("Qual é o tipo de recipiente? ");
					tipoRecipiente = sc.nextLine();
					
					produtos.cadastrarProduto(new Bebida(produtos.gerarId(),categoria,
							nome, fabricacao, 
							validade, preco, volume, teorAlcoolico, sabor, tipoRecipiente));
					break;
				}

				break;
				
				
			case 2:
				
				System.out.println("Vamos atualizar o produto!");
				System.out.println("Qual o ID do produto? ");
				
				id = sc.nextInt();
				
				var produtoBuscado = produtos.buscarNaCollection(id);
				
				if (produtoBuscado != null) {
					
					System.out.println("Digite o nome do produto: ");
					
					sc.nextLine();
					
					nome = sc.nextLine();

					System.out.println("Qual a categoria? ");

					categoria = sc.nextInt();

					System.out.println("Data de fabricação? ");
					sc.nextLine();
					fabricacao = sc.nextLine();

					System.out.println("Data de validade? ");
					validade = sc.nextLine();

					System.out.println("Preço? ");
					
					preco = sc.nextFloat();
					
					
					switch (categoria) {
					case 1:
						System.out.println("Qual é a qualidade da comida? ");
						qualidadeComida = sc.nextLine();
						System.out.println("Esse produto é alérgico? ");
						infoAlergenico = sc.nextLine();
						System.out.println("Qual o tipo de preparo? ");
						preparo = sc.nextLine();
						
						produtos.atualizarProduto(new Comida(id, categoria,
								nome, fabricacao, 
								validade, preco, qualidadeComida,
								infoAlergenico, preparo
								));
						break;
						
					case 2:
						
						System.out.println("Qual é o volume dessa bebida? ");
						volume = sc.nextDouble();
						System.out.println("Essa bebida possui álcool? ");
						sc.nextLine();
						teorAlcoolico = sc.nextLine();
						System.out.println("Qual é o sabor? ");
						sabor = sc.nextLine();
						System.out.println("Qual é o tipo de recipiente? ");
						tipoRecipiente = sc.nextLine();
						
						produtos.atualizarProduto(new Bebida(id, categoria,
								nome, fabricacao, 
								validade, preco, volume, teorAlcoolico, sabor, tipoRecipiente
								));
						
						break;
					
						break;
					
					case 3:
						System.out.println("Buscar produto por ID: ");
						
						System.out.println("Digite o ID do produto: ");
						
						id = sc.nextInt();
						
						produtos.procurarPorId(id);
						
						
						break;
				
					
					
				}
			
	
			}

		}

	}


