package com.blog.blog.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.blog.blog.model.Usuario;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L; // anotação interna

	private String userName;
	private String password;

	// construtor de classe:
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}

	// construtor vazio
	public UserDetailsImpl() {
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password; // trocamos aqui para retornar a senha
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName; // trocamos aqui para retornar o username
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true; // virou true por boas praticas
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true; // virou true por boas praticas
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true; // virou true por boas praticas
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true; // virou true por boas praticas
	}

}
