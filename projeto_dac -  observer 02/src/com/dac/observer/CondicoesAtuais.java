package com.dac.observer;

import java.util.Observable;
import java.util.Observer;

import com.dac.sujeito.ClimaDados;
import com.dac.view.ExibeElemento;

public class CondicoesAtuais implements Observer, ExibeElemento {

	Observable observable;

	private float temp;

	private float umid;

	private float pressao;

	public CondicoesAtuais(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub

		System.out.println("Condicoes atuais: " + temp + "°C e " + umid
				+ "% de umidade " + pressao + " pressao");

	}

	@Override
	public void update(Observable obs, Object arg1) {
		// TODO Auto-generated method stub

		if (obs instanceof ClimaDados) {

			ClimaDados climaDados = (ClimaDados) obs;
			this.temp = climaDados.getTemperatura();
			this.pressao = climaDados.getPressao();
			this.umid = climaDados.getUmidade();
			exibir();

		}

	}

}
