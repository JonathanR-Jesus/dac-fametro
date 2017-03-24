package com.dac.simulador;

import com.dac.observer.CondicoesAtuais;
import com.dac.sujeito.ClimaDados;

public class Simulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClimaDados clima = new ClimaDados();
		
		CondicoesAtuais atuais = new CondicoesAtuais(clima);
		
		
		clima.setMedidas(28, 70, 60);
//		clima.medidasAlteradas();
		
		clima.setMedidas(40, 30, 15);
		clima.medidasAlteradas();

	}

}
