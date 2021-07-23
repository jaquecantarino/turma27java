package com.helloworld.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habmen")

public class HabMenController {
	
	@GetMapping
	public String HabMen() {
		return "Usamos a mentalidade persistencia e Habilidade de Atenção aos detalhes.";
	}

}
