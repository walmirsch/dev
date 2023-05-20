package br.com.isiflix.livro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String sayWelcome() {
		return "<pre>"
				+ " Bem vindo a API de livros<br/>"
				+ " Endpoints Disponiveis <br/>"
				+ " /livros (GET) - para recuperar tudo <br/>"
				+ " /livros/id (GET) - para recuperar detalhes de um livro <br/>"
				+ " /livros (POST) - para incluir um novo livro</pre>";
	}
}
