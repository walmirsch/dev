package br.com.winner.biblioteca.services;

import java.util.ArrayList;

import br.com.winner.biblioteca.model.Livro;

public interface ILivroService {
public ArrayList<Livro> recuperarTodos();
public Livro recuperarPeloId(int id);
public ArrayList<Livro> recuperarPeloTitulo(String palavra);
public Livro adicionarNovo(Livro novo);
} // ILivroService
