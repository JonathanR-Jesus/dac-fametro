package br.com.fanetro.springdac;

import br.com.fanetro.springdac.fabrica.Aplicacao;
import br.com.fanetro.springdac.fabrica.MinhaAplicacao;
import br.com.fanetro.springdac.produto.Documento;
import br.com.fanetro.springdac.produto.DocumentoWorld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinhaAplicacao aplicacao = new MinhaAplicacao();
		
		aplicacao.criarDocumento(".ppt");
	    aplicacao.novoDocumento();
	    aplicacao.abirDocumento();
		aplicacao.gravarDocumento();
		aplicacao.fecharDocumento();
		
		
	
			
		
		
		
		

	}

}
