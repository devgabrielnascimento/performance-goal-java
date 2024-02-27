package produto.controller;

import java.util.ArrayList;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;
	@Override
	public void procurarPorId(int id) {
		
		Produto produto = buscarNaCollection(id);
		
		if (produto != null) {
			produto.verInformacoes();
		} else
			System.out.println("O produto ID: " + produto + " não foi encontrado!");
		
	};

	@Override
	public void listarTodasProdutos() {
		
		for (Produto produto : listaProdutos) {
			produto.verInformacoes();
		}
		
	};

	@Override
	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O produto ID: " + produto.getId() + " foi criado com sucesso!");
	};

	@Override
	public void atualizarProduto(Produto produto) {
		var produtoBuscado = buscarNaCollection(produto.getId());
		
		if (produtoBuscado != null) {
			listaProdutos.set(listaProdutos.indexOf(produtoBuscado), produto);
			System.out.println("O produto ID: " + produto.getId() + " foi atualizado com sucesso!");
		} else
			System.out.println("O produto ID: " + produto.getId() + " não foi encontrado!");
			
	};

	@Override
	public void deletarProduto(int id) {
		
		Produto produto = buscarNaCollection(id);
		
		if (produto != null) {
			
			if (listaProdutos.remove(produto) == true)
				System.out.println("O produto ID:  " + produto + " foi deletado com sucesso! ");
		} else
			
			System.out.println("O produto ID: " + produto + " não foi encontrado!");
		
		
	};
	
	public int gerarId() {
		
		return ++ id;

	}
	
	
	
	//Esse método vai percorrer no ArrayList Produto e verificar se 
	//o id do objeto produto é equivalente ao que foi lhe passado como
	//parâmetro, caso sim, retornar esse produto, senão, retorna null;
	public Produto buscarNaCollection(int id) {
		
		for (Produto produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	

}
