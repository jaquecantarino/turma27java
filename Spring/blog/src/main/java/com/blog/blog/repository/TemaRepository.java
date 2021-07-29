package com.blog.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blog.blog.model.Tema;
import java.util.List;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
