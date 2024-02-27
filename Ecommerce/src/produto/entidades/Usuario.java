package produto.entidades;

public abstract class Usuario {
	
	private int Id;
	private int tipoConta;
	private String email;
	private String nome;
	private String genero;
	
	public Usuario(int id, int tipoConta, String email, String nome, String genero) {
		super();
		Id = id;
		this.tipoConta = tipoConta;
		this.email = email;
		this.nome = nome;
		this.genero = genero;
	}
	public int getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	
	public void verInformacoes() {

		String tipoConta = "";

		switch (this.tipoConta) {
		case 1:
			tipoConta = "Vendedor";
			break;
		case 2:
			tipoConta = "Cliente";
			break;
		}

		System.out.println("--------------------------------");
		System.out.println("-- Informações da conta: --");
		System.out.println("--------------------------------");
		System.out.println("Número da conta: " + getId());
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Nome" + getNome());
		System.out.println("E-mail: " + getEmail());
		System.out.println("Gênero: " + getGenero());
	}
}
