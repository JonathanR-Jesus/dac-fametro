package com.fametro.dac.simulador;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

import com.fametro.dac.bebida.Bebida;
import com.fametro.dac.bebida.Cappuccino;
import com.fametro.dac.bebida.Carioca;
import com.fametro.dac.bebida.Expresso;
import com.fametro.dac.condimentos.Creme;
import com.fametro.dac.condimentos.Leite;

public class CafeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("0.00");

		Bebida bebida = new Expresso();

		System.out.println(bebida.getDescricao() + "R$ " + df.format(bebida.custo()));

		Bebida bebida2 = new Expresso();
		bebida2 = new Leite(bebida2);
		bebida2 = new Leite(bebida2);
		bebida2 = new Creme(bebida2);

		System.out.println(bebida2.getDescricao() + "R$ " + df.format(bebida2.custo()));

		Bebida bebida3 = new Carioca();
		bebida3 = new Leite(bebida3);
		bebida3 = new Leite(bebida3);
		bebida3 = new Creme(bebida3);

		System.out.println(bebida3.getDescricao() + "R$ " + df.format(bebida3.custo()));
		

		Bebida bebida4 = new Cappuccino();
		bebida4 = new Leite(bebida4);
		bebida4 = new Leite(bebida4);
		bebida4 = new Creme(bebida4);

		System.out.println(bebida4.getDescricao() + "R$ " + df.format(bebida4.custo()));


	}
}
