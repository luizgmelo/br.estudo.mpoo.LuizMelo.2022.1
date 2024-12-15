package model;

// Abstração: Classe apenas no conceito.
public abstract class Pessoa {
	// --- Atributos ---
	// Encapsulamento: Modificadores de acesso
	public String nome; // Todo o programa tem acesso;
	private String cpf; // So a classe tem acesso;
	protected String sexo; // Todas as classes do pacote;
	// String defaultString; //(default) = protected;
	// -----------------
	
	// Construtor
	public Pessoa(String nome, String cpf, String sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	// Polimorfismo -> Poli (muitas) morfismo (formas)
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + "]";
	}

	public String getCpf() {
		return cpf;
	}
}
