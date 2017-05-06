package br.com.fanetro.springdac.produto;

public abstract class Documento {
	
	
	
	public void abrir(){
		System.out.println("Documento: Abrir documento! ");
	}
	
	public void fechar () {
		
		System.out.println("Documento: Fechar Documento");
	}
	
	public void gravar(){
		System.out.println("Documento: Gravar documento");
	}

}
