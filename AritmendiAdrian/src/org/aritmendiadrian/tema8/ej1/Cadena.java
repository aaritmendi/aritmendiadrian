package org.aritmendiadrian.tema8.ej1;

public class Cadena {
	private String Cadena;

	public Cadena(String cadena) {
		super();
		Cadena = cadena;
	}

	public String getCadena() {
		return Cadena;
	}

	public void cDelante(String s) {
		Cadena = s + " " + Cadena;
	}

	public void cDetras(String s) {
		Cadena = Cadena + " " + s;
	}

	public void quitar(String c) {
		Cadena=Cadena.replaceAll(c, "");
	}

	public void quitar(String c, int numero) {
		for (int a = 0; a < numero; a++) {
			Cadena=Cadena.replaceFirst(c,"");
		}
	}

}
