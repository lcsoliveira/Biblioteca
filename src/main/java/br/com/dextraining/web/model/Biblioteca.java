package br.com.dextraining.web.model;

import java.util.ArrayList;
import java.util.List;



public class Biblioteca {

	
	private List<Livro> livros = new ArrayList<>();

	
	//Get and Setters	
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	
	
	
	
}
