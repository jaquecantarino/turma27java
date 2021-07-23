package com.helloworld.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		return "Quero aprender para fazer um projeto integrador e blog pessoal incrivel <3 ";
	}

}
