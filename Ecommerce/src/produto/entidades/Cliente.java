package produto.entidades;

public class Cliente extends Usuario {
	
	private String usuario;
	private String senha;

	public Cliente(int id, int tipoConta, String email, String nome, String genero, String usuario, String senha) {
		super(id, tipoConta, email, nome, genero);
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public void verInformacoes() {
		super.verInformacoes();

		System.out.println("Nome de usuário: " + this.usuario);
		System.out.println("Nome de usuário: " + this.senha);
		System.out.println("--------------------------------");
	}

}