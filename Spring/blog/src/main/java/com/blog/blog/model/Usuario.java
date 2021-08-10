package com.blog.blog.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O atributo nome é obrigatório")
	@Size(min=2, max=35, message = "O atributo nome deve ter no mínimo 05 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo usuário é obrigatório")
	@Size(min=5, max=75)
	@Email(message = "O atributo usuário deve ser um email")
	private String usuario;
	
	@NotBlank(message = "O atributo senha é obrigatório")
	@Size(min=2,max=1000,message = "O atributo senha deve ter no mínimo 8 caracteres")
	private String senha;
	
	@Column(name = "dt_nascimento")
	@JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dataNascimento;
	
	@OneToMany (mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List <Postagem> postagem;
	
	// Primeiro método Construtor - Com os atributos
	public Usuario(long id, String nome, String usuario, String senha,
	LocalDate dataNascimento) {
	this.id = id;
	this.nome = nome;
	this.usuario = usuario;
	this.senha = senha;
	this.dataNascimento = dataNascimento;
	}
	// Segundo método Construtor - Sem os atributos
	public Usuario() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

}
