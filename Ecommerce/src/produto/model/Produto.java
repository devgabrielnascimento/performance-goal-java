package produto.model;

import produto.entidades.Cliente;

public abstract class Produto {

	private int id;
	private int categoria;
	private String nome;
	private String fabricacao;
	private String validade;
	private float preco;
	
	private Cliente cliente;
	
	
	public Produto(int id, int categoria, String nome, String fabricacao, String validade, float preco) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.nome = nome;
		this.fabricacao = fabricacao;
		this.validade = validade;
		this.preco = preco;
	}
	
	
	

	public Produto(int id, int categoria, String nome, String fabricacao, String validade, float preco,
			Cliente cliente) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.nome = nome;
		this.fabricacao = fabricacao;
		this.validade = validade;
		this.preco = preco;
		this.cliente = cliente;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void verInformacoes() {

		String categoria = "";

		switch (this.categoria) {
		case 1:
			categoria = "Comida";
			break;
		case 2:
			categoria = "Bebida";
			break;
		}

		System.out.println("--------------------------------");
		System.out.println("-- Informações do produto: --");
		System.out.println("--------------------------------");
		System.out.println("ID do produto: " + getId());
		System.out.println("Nome do produto: " + getNome());
		System.out.println("Categoria: " + categoria);
		System.out.println("Data de fabricação: " + getFabricacao());
		System.out.println("Data de validade: " + getValidade());
		System.out.println("Preço: " + getPreco());
	}
}
