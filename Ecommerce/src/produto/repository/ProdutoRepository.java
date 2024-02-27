package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
	
	public void procurarPorId(int id);
	public void listarTodasProdutos();
	public void cadastrarProduto(Produto produto);
	public void atualizarProduto(Produto produto);
	public void deletarProduto(Produto produto);
}
