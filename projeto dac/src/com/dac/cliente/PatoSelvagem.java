package com.dac.cliente;
import com.dac.voo.*;

public class PatoSelvagem extends Pato {
	
	public PatoSelvagem(){
		
		vooComp = new VooNao();
	}
	
	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		System.out.println("pato selvagem ...");
	}
	
	@Override
	public void realizarVoo() {
		// TODO Auto-generated method stub
		vooComp.voar();
	}

}
