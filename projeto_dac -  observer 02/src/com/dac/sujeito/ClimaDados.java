package com.dac.sujeito;

import java.util.Observable;
import java.util.Observer;



public class ClimaDados extends Observable {


	private float temp;

	private float umid;

	private float pressao;

	

	public float getTemperatura() {
		
		return temp;

	}

	public float getUmidade() {

		return umid;
	}

	public float getPressao() {
		
		return pressao;
	}

	public void medidasAlteradas() {

		setChanged();
		notifyObservers();
	}

	public void setMedidas(float t, float u, float p) {
		temp = t;
		umid = u;
		pressao = p;
	}
	
	
	
}
