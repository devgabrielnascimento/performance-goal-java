package produto.entidades;

public class Vendedor extends Usuario {


	private String usuario;
	private String senha;
	private String ocupacao;
	
	
	public Vendedor(int id, int tipoConta, String email, String nome, String genero, String usuario, String senha, String ocupacao) {
		super(id, tipoConta, email, nome, genero);
		this.usuario = usuario;
		this.senha = senha;
		this.ocupacao = ocupacao;
		
	}

	public void verInformacoes() {
		super.verInformacoes();

		System.out.println("Nome de usuário: " + this.usuario);
		System.out.println("Nome de usuário: " + this.senha);
		System.out.println("Nome de usuário: " + this.ocupacao);
		System.out.println("--------------------------------");
	}

}
