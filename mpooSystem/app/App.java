package app;

import model.Administrador;
import model.BaseDados;
import model.Usuario;

public class App {
	public static void main(String[] args) {
		
		BaseDados.createBase();
	
		BaseDados.adicionarPessoa(new Usuario("Guilherme", "344.902.100-19", "gui", "123"));
		BaseDados.adicionarPessoa(new Usuario("Maria", "969.608.770-59", "maria", "abc123"));
		BaseDados.adicionarPessoa(new Usuario("João", "547.595.700-20", "joao", "senha123"));
		BaseDados.adicionarPessoa(new Usuario("Ana", "485.197.320-97", "ana", "pass123"));
		BaseDados.adicionarPessoa(new Usuario("Carlos", "584.732.850-85", "carlos", "qwerty"));
		BaseDados.adicionarPessoa(new Usuario("Pedro", "640.951.230-95", "pedro", "12345"));
		BaseDados.adicionarPessoa(new Usuario("Lucia", "823.041.720-24", "lucia", "mypassword"));
		BaseDados.adicionarPessoa(new Usuario("Ricardo", "730.847.050-46", "ricardo", "test1234"));
		BaseDados.adicionarPessoa(new Usuario("Mariana", "822.325.670-36", "mariana", "admin123"));
		BaseDados.adicionarPessoa(new Usuario("Felipe", "215.201.770-62", "felipe", "welcome1"));
		BaseDados.adicionarPessoa(new Administrador("Jose", "425.390.730-00", "F", "jose", "123", "69"));
		
		System.out.println(BaseDados.listUsuario());
		
		System.out.println(BaseDados.buscarPessoa("584.732.850-85"));
		
		System.out.println(BaseDados.isUsuario("ana", "pass123"));
		System.out.println(BaseDados.removerPessoa(new Usuario(null, "485.197.320-97", null, null)));
		System.out.println(BaseDados.isUsuario("ana", "pass123"));
		System.out.println(BaseDados.isAdmin("69"));
		System.out.println(BaseDados.isAdmin("22"));

	}
}
