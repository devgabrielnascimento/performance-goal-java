package produto.model;

public class Bebida extends Produto {

	private double volume;
	private String teorAlcoolico;
	private String sabor;
	private String tipoRecipiente;

	public Bebida(int id, int categoria, String nome, String fabricacao, String validade, float preco, double volume,
			String teorAlcoolico, String sabor, String tipoRecipiente) {
		super(id, categoria, nome, fabricacao, validade, preco);
		this.volume = volume;
		this.teorAlcoolico = teorAlcoolico;
		this.sabor = sabor;
		this.tipoRecipiente = tipoRecipiente;
	}

	public void verInformacoes() {

		super.verInformacoes();
		System.out.println("Qual é o volume dessa bebida? " + this.volume);
		System.out.println("Essa bebida possui álcool? " + this.teorAlcoolico);
		System.out.println("Qual é o sabor? " + this.sabor);
		System.out.println("Qual é o tipo de recipiente? " + this.tipoRecipiente);
		System.out.println("--------------------------------");
	}

}
