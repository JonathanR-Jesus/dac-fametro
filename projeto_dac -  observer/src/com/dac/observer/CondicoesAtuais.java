package com.dac.observer;

import com.dac.sujeito.ClimaDados;
import com.dac.sujeito.Sujeito;
import com.dac.view.ExibeElemento;

public class CondicoesAtuais implements Observer , ExibeElemento{
	
	private float temp;
	
	private float umid;
	
	private float pressao;
	
	private Sujeito climaDados;
	
	
	public CondicoesAtuais(Sujeito climaDados) {
		// TODO Auto-generated constructor stub
		
		this.climaDados = climaDados;
		climaDados.registerObserver(this);
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		
		System.out.println("Condicoes atuais: " + temp + "°C e " + umid + "% de umidade " 
				+ pressao + " pressao");
		
	}

	@Override
	public void update(float temp, float umidade, float pressao) {
		// TODO Auto-generated method stub
		
		this.temp = temp;
		this.umid = umidade;
		this.pressao = pressao;
		exibir();
		
	}


}
