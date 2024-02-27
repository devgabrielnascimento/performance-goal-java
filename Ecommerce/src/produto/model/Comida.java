package produto.model;

public class Comida extends Produto {

	private String qualidadeComida;
	private String infoAlergenico;
	private String preparo;
	
	public Comida(int id, int categoria, String nome, String fabricacao, String validade, float preco, String qualidadeComida, String infoAlergenico, String preparo) {
		super(id, categoria, nome, fabricacao, validade, preco);
		this.qualidadeComida = qualidadeComida;
		this.infoAlergenico = infoAlergenico;
		this.preparo = preparo;
	}

	
	public void verInformacoes() {
		
		super.verInformacoes();
		System.out.println("Qual é a qualidade da comida? " + this.qualidadeComida);
		System.out.println("Esse produto é alérgico? " + this.infoAlergenico);
		System.out.println("Qual o tipo de preparo? " + this.preparo);
		System.out.println("--------------------------------");
	}

}
