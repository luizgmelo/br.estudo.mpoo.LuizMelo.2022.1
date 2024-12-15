package model;

public class Administrador extends Usuario {
	private String chaveAcesso;

	public Administrador(String nome, String cpf, String sexo, String login, String senha, String chaveAcesso) {
		super(nome, cpf, sexo, login, senha);
		this.chaveAcesso = chaveAcesso;
	}

	public String getChaveAcesso() {
		return chaveAcesso;
	}

	@Override
	public String toString() {
		return "Administrador [login=" + login + ", nome=" + nome + ", sexo=" + sexo + ", getCpf()=" + getCpf() + "]";
	}

}
