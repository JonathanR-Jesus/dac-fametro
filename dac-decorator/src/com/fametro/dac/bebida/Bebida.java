package com.fametro.dac.bebida;

public abstract class Bebida {
	
	String descricao = "bebida indefinida";
		
	public String getDescricao(){
		
		return descricao;
	}
	
	public abstract double custo();

}
