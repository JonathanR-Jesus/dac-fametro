package br.com.fametro.dac;

public class TesteIncremental {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Incremental inc = Incremental.getInstance();
			System.out.println(inc.toString2());
			System.out.println(inc);
		}
	}

}
