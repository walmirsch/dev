package br.com.isiflix.livro.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.isiflix.livro.model.Livro;

public interface LivroRepo extends CrudRepository<Livro, Integer>{

	public ArrayList<Livro> findByTituloContaining(String palavraChave);
}
