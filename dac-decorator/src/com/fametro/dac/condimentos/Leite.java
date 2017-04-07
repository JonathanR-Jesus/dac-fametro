package com.fametro.dac.condimentos;

import com.fametro.dac.bebida.Bebida;

public class Leite extends  CondimentoDecorator {
	
	Bebida bebida;
	
	
	public Leite (Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return bebida.getDescricao() + ", Leite";
	}
	
	public double custo() {
		
		return bebida.custo() + .50;
	}

}
