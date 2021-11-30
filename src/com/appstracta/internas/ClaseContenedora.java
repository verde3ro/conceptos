package com.appstracta.internas;

public class ClaseContenedora {

	public String getIdCc() {
		return IdCc;
	}

	String IdCc;

	public Interna getIntEnExt() {
		return intEnExt;
	}

	Interna intEnExt;

	public ClaseContenedora() {
	}

	public ClaseContenedora(String IdCc) {
		this.intEnExt = new Interna("Int1");
		this.IdCc = IdCc;
	}

	// Clase Interna
	public class Interna{
		public String getNombre() {
			return nombre;
		}

		String nombre;

		public Interna(String nombre) {
			this.nombre = nombre;
		}
	}

}
