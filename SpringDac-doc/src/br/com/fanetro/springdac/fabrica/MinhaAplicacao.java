package br.com.fanetro.springdac.fabrica;

import br.com.fanetro.springdac.produto.*;

public class MinhaAplicacao extends Aplicacao
{
	

	@Override
	public Documento criarDocumento(String formato)
	{
		// TODO: Implement this method
		this.formato = formato;
		
		if(formato.equals(".ppt")){
			
			return new DocumentoPowerPoint();
		}
		
		else if (formato.equals(".doc")){
			
			return new DocumentoWorld();
		}
		
		else if (formato.equals(".xls")){
			
			return new DocumentoExcel();
		}
		
		else{
			return null;
		}
	}
	

	
	
	
	
	
	
	


	
	

}
