package com.dac.sujeito;

import java.util.ArrayList;

import com.dac.observer.Observer;

public class ClimaDados implements Sujeito {

	private ArrayList observers;

	private float temp;

	private float umid;

	private float pressao;

	public ClimaDados() {
		// TODO Auto-generated constructor stub

		observers = new ArrayList<Observer>();
	}

	public void getTemperatura() {

	}

	public void getUmidade() {

	}

	public void getPressao() {

	}

	public void medidasAlteradas() {

		notifyObserver();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub

		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(o);
		}

	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub

		for (int i = 0; i < observers.size(); i++) {
			Observer obs = (Observer) observers.get(i);
			obs.update(temp, umid, pressao);
		}

	}

	public void setMedidas(float t, float u, float p) {
		temp = t;
		umid = u;
		pressao = p;
	}

}
