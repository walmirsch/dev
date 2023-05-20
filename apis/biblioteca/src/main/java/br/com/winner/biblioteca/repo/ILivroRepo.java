package br.com.winner.biblioteca.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.winner.biblioteca.model.Livro;

public interface ILivroRepo extends CrudRepository<Livro, Integer> {
public ArrayList<Livro> FindByOrderByTitulo();
	public ArrayList<Livro> FindByTituloContaining(String palavra);
} // ILivroRepo
