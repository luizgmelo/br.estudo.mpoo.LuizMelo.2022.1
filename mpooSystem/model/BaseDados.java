package model;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<Pessoa> pessoas;
	
	public static void createBase() {
		inicializarBase();
	}
	
	private static void inicializarBase() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	public static Pessoa buscarPessoa(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }
	
	public static boolean isPessoa(Pessoa pessoa) {
		// Metódo contains do ArrayList serve para verificar se (Objeto está no arrayList)
		return pessoas.contains(buscarPessoa(pessoa.getCpf()));
	}
	
	public static boolean isUsuario(Usuario usuario) {
		 for (Pessoa pessoa : pessoas) {
			 if (pessoa instanceof Usuario) {
				 // Casting - Voce consegue subir na heranca ou descer
				 if ( ((Usuario) pessoa).login.equalsIgnoreCase(usuario.login) &&
					  ((Usuario) pessoa).getSenha().equals(usuario.getSenha())	
				 ) {
					 return true;
				 }
			 }
        }
        return false;
	}
	
	// Reutilização de código
	public static boolean isUsuario(String login, String senha) {
		 return isUsuario(new Usuario(null, null, login, senha));
	}
	
	public static boolean isAdmin(String chaveAcesso) {
		 for (Pessoa pessoa : pessoas) {
			 if (pessoa instanceof Administrador) {
				 // Casting - Voce consegue subir na heranca ou descer
				 if (((Administrador) pessoa).getChaveAcesso().equalsIgnoreCase(chaveAcesso)) {
					 return true;
				 }
			 }
       }
       return false;
	}
	
	
	public static boolean adicionarPessoa(Pessoa pessoa) {
		if (pessoa != null) {
			if (ValidadorCPF.validarCPF(pessoa.getCpf())) {
				return pessoas.add(pessoa);
			}
		}
		return false;
	}
	
	public static boolean removerPessoa(Pessoa pessoa) {
		return pessoas.remove(buscarPessoa(pessoa.getCpf()));
	}
	
	public static ArrayList<String> listPessoas() {
		ArrayList<String> listaPessoas = new ArrayList<String>(); // []
		for (Pessoa pessoa : pessoas) {
			listaPessoas.add(pessoa.toString()); // [ Pessoa1, Pessoa2, Pessoa3 ]
		}
		return listaPessoas;		
	}
	
	
	public static ArrayList<String> listUsuario() {
		return listPessoas();	
	}
	
	
	
	
}
