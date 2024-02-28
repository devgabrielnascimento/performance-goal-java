package produto;

import java.util.ArrayList;
import java.util.Scanner;
import produto.controller.ProdutoController;
import produto.entidades.Cliente;
import produto.entidades.Usuario;
import produto.entidades.Vendedor;
import produto.model.Bebida;
import produto.model.Comida;
import produto.util.MenuStrings;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao, id, categoria, idVendedor, idCliente;
		String nome, fabricacao, validade, qualidadeComida, infoAlergenico, preparo, teorAlcoolico, sabor,
				tipoRecipiente, resposta, senha, nmUsuario; 
		float preco;
		double volume;
		boolean vendedorAutenticado = false, clienteAutenticado = false;

		ProdutoController produtos = new ProdutoController();

		idVendedor = 1;
		idCliente = 1;
		String ocupacao = "Vendedor";

		Vendedor vendedor = new Vendedor(idVendedor, 1, "gabrielnascimento@email.com", "Gabriel", "masculino",
				"gabrieldev", "1", ocupacao);
		Cliente cliente = new Cliente(idCliente, 1, "teste@gmail.com", "Teste", "não-binárie", "teste", "1");

		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios.add(vendedor);
		listaUsuarios.add(cliente);
		
		System.out.println("                                             ");
		System.out.println("------------------ LOGIN ------------------: ");
		System.out.println("                                             ");
		System.out.print("\nDigite o seu usuário: ");
		nmUsuario = sc.nextLine();
		System.out.print("\nSenha:");
		senha = sc.nextLine();

		for (Usuario usuario : listaUsuarios) {

			if (vendedor.getSenha().equals(senha) && vendedor.getUsuario().equals(nmUsuario)
					&& vendedor.getOcupacao().equals("Vendedor")) {

				vendedorAutenticado = true;
				System.out.println("\n" + usuario.getNome() + " logado com sucesso!");
			}
			
			else if (cliente.getSenha().equals(senha) && cliente.getUsuario().equals(nmUsuario)) {
				clienteAutenticado = true;
				System.out.println("\n" + cliente.getNome() + " logado com sucesso!");
				break;
			}
			if (!vendedorAutenticado || clienteAutenticado) {
				System.out.println("Usuário ou senha incorretos!");
				sc.close();
				return;
			}
			
			
			
			
			

			while (vendedorAutenticado = true) {

				
				System.out.println(MenuStrings.MENUVENDEDOR);

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
					sc.nextLine();

					switch (categoria) {
					case 1:
						System.out.println("Qual é a qualidade da comida? ");
						qualidadeComida = sc.nextLine();
						System.out.println("Esse produto é alérgico? ");
						infoAlergenico = sc.nextLine();
						System.out.println("Qual o tipo de preparo? ");
						preparo = sc.nextLine();

						produtos.cadastrarProduto(new Comida(produtos.gerarId(), categoria, nome, fabricacao, validade,
								preco, qualidadeComida, infoAlergenico, preparo));
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

						produtos.cadastrarProduto(new Bebida(produtos.gerarId(), categoria, nome, fabricacao, validade,
								preco, volume, teorAlcoolico, sabor, tipoRecipiente));
						break;

					}
					break;

				case 2:

					System.out.println("Vamos atualizar o produto!");
					System.out.println("Qual o ID do produto? ");

					id = sc.nextInt();

					var produtoBuscado = produtos.buscarNaCollection(id);

					if (produtoBuscado != null) {

						sc.nextLine();
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

							produtos.atualizarProduto(new Comida(id, categoria, nome, fabricacao, validade, preco,
									qualidadeComida, infoAlergenico, preparo));
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

							produtos.atualizarProduto(new Bebida(id, categoria, nome, fabricacao, validade, preco,
									volume, teorAlcoolico, sabor, tipoRecipiente));
							break;
						}
					} else {
						System.out.println("Produto não encontrado!");
					}
					break;

				case 3:

					System.out.println("Vamos deletar um produto: ");
					System.out.println("Digite o ID do produto: ");
					id = sc.nextInt();

					produtos.deletarProduto(id);

					break;

				case 4:
					System.out.println("Buscar produto por ID: ");

					System.out.println("Digite o ID do produto: ");

					id = sc.nextInt();

					produtos.procurarPorId(id);
					sc.nextLine();
					if (produtos.buscarNaCollection(id) == null) {
						System.out.println("Não encontramos esse produto! Deseja cadastrá-lo mesmo? "
								+ "\nEscreva sim para cadastrar");
						resposta = sc.nextLine();
						if (resposta.equalsIgnoreCase("sim")) {
							System.out.println("Vamos cadastrar esse produto!");

							System.out.println("\nOk, para começar, digite o nome desse produto");

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
							sc.nextLine();

							switch (categoria) {
							case 1:
								System.out.println("Qual é a qualidade da comida? ");
								qualidadeComida = sc.nextLine();
								System.out.println("Esse produto é alérgico? ");
								infoAlergenico = sc.nextLine();
								System.out.println("Qual o tipo de preparo? ");
								preparo = sc.nextLine();

								produtos.cadastrarProduto(new Comida(id, categoria, nome, fabricacao, validade, preco,
										qualidadeComida, infoAlergenico, preparo));
								produtos.procurarPorId(id);
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

								produtos.cadastrarProduto(new Bebida(id, categoria, nome, fabricacao, validade, preco,
										volume, teorAlcoolico, sabor, tipoRecipiente));
								produtos.procurarPorId(id);
								break;

							}

						}
					}

					break;

				case 5:

					System.out.println("Listando produtos: ");

					produtos.listarTodosProdutos();

					break;

				case 6:
					sc.close();
					System.exit(0);
					System.out.println("Programa finalizado!");

				}

			}

		}
		
		while(clienteAutenticado) {
			
			System.out.println(MenuStrings.MENUCLIENTE);
			
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:
				
				System.out.println("oi");
				
			break;
			
			case 2:
				
				System.out.println("tchau");
				
			break;
			
			case 3: 
				sc.close();
				System.exit(0);
				System.out.println("Programa finalizado!");
			}
			
			
				
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}