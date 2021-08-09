package com.lojaGame.lojaGame.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lojaGame.lojaGame.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	/*<Usuario = significa a classe em que estamos trabalhando. Long> = é a nossa
	 * chave primaria.*/

	public Optional<Usuario> findByUsuario(String usuario);
	
	/*
	 * criamos o metodo para inserir a consulta pelo usuario. Faremos da seguinte
	 * forma:( criamos o metodo porque o findByUsuario não é padrão, então criamos
	 * personalizado)
	 */

	/*
	 * Comparando ao banco de dados:select* from tb_usuario where usuario =
	 * "xpto"Find= select By = where Usuario = usuario=parameto
	 */

	/*
	 * Usamos o Optional porque quando fazemos uma busca por um usuario pode-se
	 * encontrar um usuario ou não, se não encontrar a resposta do metodo vai ser
	 * nulla, para evitar o erros de exceção usamos o optional, assim pode voltar
	 * nullo caso o usuario não exista.
	 */

}
