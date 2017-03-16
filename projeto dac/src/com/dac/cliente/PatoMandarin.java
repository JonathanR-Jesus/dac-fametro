package com.dac.cliente;

import com.dac.grasno.GrasnoComportamento;
import com.dac.grasno.GrasnoNao;
import com.dac.voo.VooComportamento;
import com.dac.voo.VooNao;

public class PatoMandarin extends Pato {
	
	public PatoMandarin() {
		// TODO Auto-generated constructor stub
		
		vooComp = new VooNao();
		grasnoComp = new GrasnoNao();
	}
	
	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		System.out.println("pato mandarin ...");
	}
	
	@Override
	public void realizarVoo() {
		// TODO Auto-generated method stub
		
		vooComp.voar();	
	}
	
	@Override
	public void setVooComp(VooComportamento vc) {
		// TODO Auto-generated method stub
		vooComp = vc;
		
	}
	
	@Override
	public void realizarGrasno() {
		// TODO Auto-generated method stub
		grasnoComp.grasnar();
	}
	
	@Override
	public void setGrasnoComp(GrasnoComportamento gc) {
		// TODO Auto-generated method stub
		grasnoComp = gc;
	}

}
