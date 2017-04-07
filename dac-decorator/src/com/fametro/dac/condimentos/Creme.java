package com.fametro.dac.condimentos;

import com.fametro.dac.bebida.Bebida;

public class Creme extends  CondimentoDecorator {
	
	Bebida bebida;
	
	public Creme (Bebida bebida) {
		
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return bebida.getDescricao() + ", Creme";
	}
	
	public double custo() {
		
		return bebida.custo() + .8654;
	}
	

}
 