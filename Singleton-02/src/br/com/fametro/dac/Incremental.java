package br.com.fametro.dac;

class Incremental {

	private volatile static Incremental uniqueInstance;

	private static int count = 0;

	private int numero;

	private Incremental() {
		// TODO Auto-generated constructor stub
		numero = ++count;
	}

	public String toString2() {
		return "Incremental " + numero;
	}

	public static Incremental getInstance() {

		if (uniqueInstance == null) {

			synchronized (Incremental.class) {

				if (uniqueInstance == null) {

					uniqueInstance = new Incremental();
				}

			}

		}

		return uniqueInstance;
	}

}


