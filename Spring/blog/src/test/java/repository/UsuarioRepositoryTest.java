package repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import com.blog.blog.model.Usuario;
import com.blog.blog.repository.UsuarioRepository;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // usa qualquer porta disponivel para testar
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // prepara a classe para fazer teste de instancia
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository; // instancia o repositorio

	@BeforeAll //anotação para acontecer antes de testar, roda primeiro
	void start() {
		//para testar o banco não pode estar vazio, logo precisamos criar os dados
		LocalDate data = LocalDate.parse("2000-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		
		Usuario usuario = new Usuario(0, "João da Silva", "joao@email.com.br", "13465278", data); //data criamos em cima 
		if (usuarioRepository.findByUsuario(usuario.getUsuario()).isEmpty()) //se não retornar nada, tiver vazio
			usuarioRepository.save(usuario); // salva o usuario 
		
		usuario = new Usuario(0, "Manuel da Silva", "manuel@email.com.br", "13465278", data);
		if (usuarioRepository.findByUsuario(usuario.getUsuario()).isEmpty())
			usuarioRepository.save(usuario);
		
		usuario = new Usuario(0, "Frederico da Silva", "frederico@email.com.br", "13465278", data);
		if (!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())  //se for diferente de estar presente, isso é=ausente
			usuarioRepository.save(usuario);
		
		usuario = new Usuario(0, "Paulo Antunes", "paulo@email.com.br", "13465278", data);
		if (!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
	}

	@Test
	@DisplayName("💾 Retorna o nome")
	public void findByNomeRetornaNome() {
		Usuario usuario = usuarioRepository.findByNome("João da Silva");
		assertTrue(usuario.getNome().equals("João da Silva"));
	}

	@Test
	@DisplayName("💾 Retorna 3 usuarios")
	public void findAllByNomeContainingIgnoreCaseRetornaTresUsuarios() {
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Silva");
		assertEquals(3, listaDeUsuarios.size());
	}

	@AfterAll
	public void end() {
		System.out.println("Teste Finalizado!");
	}

}
