package com.appstracta;

import com.appstracta.abstracta.Comida;

public class Main {

	public static void main(String[] args) {
		// Uso de un objeto anomimo
		Comida comida = new Comida() {
			@Override
			public void mostrar() {
				System.out.println("Comida....");
			}
		};

		System.out.println(comida instanceof Comida);

		comida.mostrar();
		comida.imprimir();
	}

}
