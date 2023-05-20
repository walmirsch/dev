package br.com.isiflix.livro.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isiflix.livro.model.Livro;
import br.com.isiflix.livro.repo.LivroRepo;

@RestController
public class LivroController {

	@Autowired
	private LivroRepo repo;
	
	
	@GetMapping("/livros")
	public ArrayList<Livro> recuperarTodos(){
		return (ArrayList<Livro>) repo.findAll();
	}
	
	@GetMapping("/livros/{id}")
	public ResponseEntity<Livro> recuperarPeloId(@PathVariable int id){
		Livro livro = repo.findById(id).orElse(null);
		if (livro != null) {
			return ResponseEntity.ok(livro);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/livros")
	public ResponseEntity<Livro> adicionarLivro(@RequestBody Livro livro){
		Livro res = repo.save(livro);
		if (res != null) {
			return ResponseEntity.status(201).body(res);
		}
		return ResponseEntity.badRequest().build();
	}
}
