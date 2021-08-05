package com.blog.blog.security;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.blog.blog.model.Usuario;
import com.blog.blog.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService { // no inicio no video 24 não tem o implements nessa parte (?)
	
	@Autowired
	private UsuarioRepository userRepository;
	
	//@Override
	public UserDetails loadUserByUserName(String userName) throws UsernameNotFoundException {
		
		Optional<Usuario> user = userRepository.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException (userName + " not found."));
	   
		return user.map(UserDetailsImpl::new).get(); //ERRO
	}

	@Override //FIZ PORQUE ESTAVA DANDO ERRO E NÃO ME DEIXAVA SEGUIR, NÃO ENCONTREI EXPLICAÇÃO NO VÍDEO
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
