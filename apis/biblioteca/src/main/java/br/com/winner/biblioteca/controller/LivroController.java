package br.com.winner.biblioteca.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.winner.biblioteca.model.Livro;
import br.com.winner.biblioteca.services.ILivroService;

@RestController
public class LivroController {
@Autowired
private ILivroService service;
@GetMapping("/livros")
public ArrayList<Livro> recuperarTodos() {
	return service.recuperarTodos();
}
@GetMapping("/livros/{id}")
public ResponseEntity<Livro> recuperarPeloCodigo(@PathVariable int id) {
	Livro l = service.recuperarPeloId(id);
	if(l != null) {
		return ResponseEntity.ok(l);
	}
	return ResponseEntity.notFound().build();
}
@GetMapping("/livros/busca")
public ResponseEntity<?> buscarPorTitulo(@RequestParam(name = "palavra") String palavra) {
	ArrayList<Livro> lista =service.recuperarPeloTitulo(palavra);
	if(lista.size() > 0) {
		return ResponseEntity.ok(lista);
	}
	return ResponseEntity.notFound().build();
}
@PostMapping("/livros")
public ResponseEntity<Livro> adicionarNovo(@RequestBody Livro l) {
	Livro res = service.adicionarNovo(l);
	if(res != null) {
		return ResponseEntity.status(201).body(res);
	}
	return ResponseEntity.badRequest().build();
}
} // LivroController
