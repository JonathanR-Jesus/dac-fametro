package br.com.fanetro.springdac.fabrica;

import br.com.fanetro.springdac.produto.Documento;

public abstract class Aplicacao {
	
	protected Documento doc;
	protected String formato;
	
	public abstract Documento criarDocumento(String formato);
	
	public void novoDocumento() {
		
		doc = criarDocumento(formato);
		
	}
	
	public void abirDocumento() {
		
		doc.abrir();
	}
	
	public void fecharDocumento(){
		doc.fechar();
	}
	
	public void gravarDocumento(){
		
		doc.gravar();
	}

	

}
