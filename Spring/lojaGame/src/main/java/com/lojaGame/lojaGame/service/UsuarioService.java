package com.lojaGame.lojaGame.service;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.lojaGame.lojaGame.Model.Usuario;
import com.lojaGame.lojaGame.Model.UsuarioLogin;
import com.lojaGame.lojaGame.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository; // Primeiramente precisamos fazer um acesso ao banco de dados, assim,
													// trazemos a classe repository;

	// PRIMEIRO METODO PARA CADASTRAR USUARIOS
	public Optional<Usuario> cadastrarUsuario(Usuario usuario) { // recebe um objeto da classe usuario para inserir no
																	// banco de dados.
		// esse <> indica que é um Optional. Exemplo Optional<Usuario> nesse caso porque
		// ele pode ou não cadastrar.

		if (usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O usuario já está cadastrado", null);
		// no if criado aqui compara se o usuario já existe no nosso banco; *isPresent()
		// = está presente ( true or false ); throw new ResponseStatusException = faz o
		// tratamento de exceção, no caso do usuario já ser cadastrado,erro 400;

		int idade = Period.between(usuario.getDataNasc(), LocalDate.now()).getYears();
		// para me certificar que o usuario é maior de 18 anos; LocalDate.now = data
		// atual, data que está no sistema no momento./ .getYears() traga essa resposta
		// em anos / Period.between faz o calculo entre duas datas

		if (idade < 18)
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O usuario é menor de idade", null);
		// para fazer a verificação usamos o if

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); // instancia o encoder para podermos usa-los.

		String senhaEncoder = encoder.encode(usuario.getSenha()); // pega a senha do usuario e criptograda, atraves do
																	// metodo encode, do objeto encoder. E salva na
																	// variavel senhaEncoder(já criptografada)
		usuario.setSenha(senhaEncoder); // para salvar no banco eu preciso atualizar o objeto usuario, por isso fazemos
										// a alteração do objeto. Trazemos o set de senha, e trocamos pela senha
										// encriptografada.

		return Optional.of(usuarioRepository.save(usuario)); // retorne como um opcional as alterações feitas em
																// usuario.
	}

	public Optional<Usuario> atualizarUsuario(Usuario usuario) {

		if (usuarioRepository.findById(usuario.getId()).isPresent()) {

			int idade = Period.between(usuario.getDataNasc(), LocalDate.now()).getYears();

			if (idade < 18)
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O usuario é menor de idade", null);

			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

			String senhaEncoder = encoder.encode(usuario.getSenha());
			usuario.setSenha(senhaEncoder);

			return Optional.of(usuarioRepository.save(usuario));

		} else {

			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado!", null);
			// nesse caso mostramos o not found pois é uma mensagem de erro, já que não
			// existe o usuario a ser atualizado. Null serve para indicar que está nulo,
			// vazio. Ele é a causa. O throw está aqui porque estamos lançando o erro,
			// criando ele para aparecer na tela do usuario.||

		}

	}

	public Optional<UsuarioLogin> logarUsuario(Optional<UsuarioLogin> usuarioLogin) {
		// Nos metodos anteriores usamos o tipo usuario, mas para fazer o login usamos a
		// classe usuarioLogin/UserLogin, você passa um e recebe de volta, se der
		// sucesso

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); // aqui cria o encoder
		Optional<Usuario> usuario = usuarioRepository.findByUsuario(usuarioLogin.get().getUsuario());
		// primeiro ponto é saber se usuario existe. Aqui trabalhamos com classe
		// diferentes por isso usamos o get no meio para fazer a ligação das duas
		// classes usuario+usuarioLogin;

		if (usuario.isPresent()) {
			if (encoder.matches(usuarioLogin.get().getSenha(), usuario.get().getSenha())) {
				// matches faz a comparação das senhas, é um metodo de encoder.

				String auth = usuarioLogin.get().getUsuario() + ":" + usuarioLogin.get().getSenha();
				// faz a concatenação de strings. Aqui não pode esquecer os dois pontos se não
				// da erro. (+ ":" +)

				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				// IMPORTAR A BASE64 DA COMMONS CODEC
				// Pega a concatenação criptogrfa e gera o token, atraves do metodo
				// encodeBase64, faz a criptografia baseada no algoritmo de 64 bits... pega a
				// string passada, pega os bits dela converte em código ASCII(exemplo: quando
				// você aperta a o computador não entende a, ele entende uma combinação de
				// número binários. Nesse caso faz em base 64.

				String authHeader = "Basic " + new String(encodedAuth);
				// aqui vai acrescentar a palavra Basic no inicio, que gera a String authHeader
				// ( cabeçalhado de autentificação ) a palavra BASIC não pode ser alterada e tem
				// que ter um espaço no final "Basic "
				// se as senhas forem iguais ele vai criar o token.

				// para fazer os ajustes/atualizar. Pega o ID que está gravando no banco e salva
				// dentro de usuario ID, repete o processo para os outros dados
				usuarioLogin.get().setNome(usuario.get().getNome());
				usuarioLogin.get().setSenha(usuario.get().getSenha());
				usuarioLogin.get().setToken(authHeader);

				return usuarioLogin;

			}
		}
		throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Usuario ou Senha inválidos!", null);
		// precisamos, antes de mais nada, verificar se a senha está igual ao que está
		// armazenado no banco, e essa senha armazenada está criptografada, então eu
		// preciso fazer a comparação das duas senha. Para isso, fazemos a criptogração
		// da senha digitada para fazer a compração. Podemos fazer isso diretamente com
		// a Commons Codec.
	}

}
