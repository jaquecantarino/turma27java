package com.lojaGame.lojaGame.Model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank // Serve para não deixar nada nulo e nem branco, logo, não aceita só espaço, por
				// exemplo;
	@Size(min = 2, max = 35)
	private String nome;

	@NotBlank
	@Size(min = 5, max = 70)
	private String usuario;

	@NotBlank
	@Size(min = 5) // Na anotação de senha, onde criamos o parametro de tamanho com a anotação
					// @Size, é aconselhavel não colocar max, isso pode dar erro na hora de
					// criptografar a senha pode ultrapassar e não armazenar, retornando erro.Por
					// isso, deixar o @Size(min=)
	private String senha;

	@JsonFormat(pattern = "yyyy-mm-dd") // usamos essa anotação para configurar o padrão da data.
	private LocalDate dataNasc;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE) // mapeamos o objeto usuario, criado na classe/tabela
																	// produto. E usamos o cascade pois pode ter uma
																	// relação em cascata, serve para definir a maneira
																	// como os produtos serão propagados.
	@JsonIgnoreProperties("usuario") // Usamos para ter o problema da recursividade, para não ficar repetindo os
										// objetos
	private List<Produto> postagem;

	// Podemos usar uma anotação chamada @Column(nome="nomeEscolhido") para mudar o
	// nome do atributo na hora de criar a tabela no banco de dados.

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

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public List<Produto> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Produto> postagem) {
		this.postagem = postagem;
	}

}
