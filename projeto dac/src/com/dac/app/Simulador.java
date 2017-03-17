package com.dac.app;

import com.dac.cliente.Pato;
import com.dac.cliente.PatoMandarin;
import com.dac.cliente.PatoSelvagem;
import com.dac.grasno.Grasno;
import com.dac.voo.VooComAsas;
import com.dac.voo.VooNao;

public class Simulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pato selvagem = new PatoSelvagem();

		selvagem.exibir();
		selvagem.realizarVoo();

		Pato mandarin = new PatoMandarin();

		mandarin.exibir();
		mandarin.realizarVoo();
		mandarin.setVooComp(new VooComAsas());
		mandarin.realizarVoo();
		mandarin.realizarGrasno();
		mandarin.setGrasnoComp(new Grasno());
		mandarin.realizarGrasno();

	}

}
