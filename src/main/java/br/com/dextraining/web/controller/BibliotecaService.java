package br.com.dextraining.web.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.dextraining.web.model.Biblioteca;
import br.com.dextraining.web.model.Livro;

public class BibliotecaService {

	// Vamos criar uma lista statica para adionar livros a biblioteca

	private static Biblioteca biblioteca = new Biblioteca();

	
	// Criar método adicionar para adicionar um livro a lista
	public static void adicionar(Livro livro) {
		
		// livros = é uma lista de livros / livro = é um objeto que está dentro
		// da lista
		biblioteca.getLivros().add(livro);		
	}
	
	//Método do tipo List<Livro> pois necessitamos de um return do tipo Livro
	public static List<Livro> listar(){
		return biblioteca.getLivros();
		
	}
	
	
	
}
