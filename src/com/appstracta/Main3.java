package com.appstracta;

import com.appstracta.internas.ClaseContenedora;

public class Main3 {

	public static void main(String[] args) {
		ClaseContenedora cc = new ClaseContenedora("Contenedora 1");
		ClaseContenedora.Interna inter = cc.new Interna("hola");

		System.out.println("cc :: " + cc.getIdCc());
		System.out.println("cc :: " + cc.getIntEnExt().getNombre());
		System.out.println("inter :: " + inter.getNombre());
	}

}
