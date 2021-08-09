package com.lojaGame.lojaGame.Model;

public class UsuarioLogin {
	// Apesar de ser criado junto as models ela não cria uma tabela e nem é
	// relacionada com nenhuma;
	//Usamos essa classe apena no metodo de login, dentro de usuario controller

	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String token; //criamos um atributo extra

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
