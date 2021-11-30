package com.appstracta;


import com.appstracta.interfaces.IPerro;

public class Main2 {
	public static void main(String[] args) {
		// Uso de clase o objeto anonimo

		haciendoRuido(new IPerro() {
			@Override
			public String ladra() {
				return "GUAU!!!";
			}
		});
	}

	public static void haciendoRuido(IPerro p) {
		System.out.println(p.ladra());
	}

}
