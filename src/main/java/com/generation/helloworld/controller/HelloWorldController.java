package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld () {
		return "Hello World!!! :P";
	}
	
	@GetMapping("BSM")
	public String BSM () {
		return "As BSMs da Generation Brasil: \n\nMentalidades:\n- Responsabilidade pessoal;\n- Mentalidade de Crescimento;"
				+ "\n- Orientação ao futuro; \n- Persistência. \n\nHabilidades comportamentais: \n- Comunicação; \n- Trabalho em equipe;"
				+ "\n- Atenção aos detalhes; \n- Proatividade.";
	}
	
	@GetMapping("objetivos")
	public String objetivos () {
		return "Meus objetivos da semana são consolidar meu aprendizado em SQL e Spring, além de conseguir trabalhar bem com meu grupo "
				+ "no projeto integrador!";
	}
}
