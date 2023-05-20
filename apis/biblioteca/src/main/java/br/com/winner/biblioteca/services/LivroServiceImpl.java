package br.com.winner.biblioteca.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.winner.biblioteca.model.Livro;
import br.com.winner.biblioteca.repo.ILivroRepo;

@Component
public class LivroServiceImpl implements ILivroService {
@Autowired
private ILivroRepo repo;

	@Override
	public ArrayList<Livro> recuperarTodos() {
		return (ArrayList<Livro>) repo.FindByOrderByTitulo();
	}

	@Override
	public Livro recuperarPeloId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public ArrayList<Livro> recuperarPeloTitulo(String palavra) {
		return repo.FindByTituloContaining(palavra);
	}

	@Override
	public Livro adicionarNovo(Livro novo) {
		return repo.save(novo); 
	}

} // LivroServiceImpl
