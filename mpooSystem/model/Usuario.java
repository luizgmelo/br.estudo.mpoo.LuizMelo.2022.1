package model;

// Extends: Heranca quando uma classe tem acesso as caracteristicas de outra classe (extends superClasse)
public class Usuario extends Pessoa {

	public String login;
	private String senha;
	
	public Usuario(String nome, String cpf, String sexo, String login, String senha) {
		super(nome, cpf, sexo);
		this.login = login;
		this.senha = senha;
	}
	
	public Usuario(String nome, String cpf, String login, String senha) {
		super(nome, cpf);
		this.login = login;
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
}
