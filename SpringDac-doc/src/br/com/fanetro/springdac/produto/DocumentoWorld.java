package br.com.fanetro.springdac.produto;

public class DocumentoWorld extends Documento {

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		System.out.println("Abrindo documento world");
	}

	public void fechar() {

		System.out.println("Fechando Documentow world");
	}

	public void gravar() {
		System.out.println("Gravando Documento world");
	}

}
