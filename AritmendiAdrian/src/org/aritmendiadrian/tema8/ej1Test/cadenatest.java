package org.aritmendiadrian.tema8.ej1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.aritmendiadrian.tema8.ej1.Cadena;;

class cadenatest {

	Cadena cad =new Cadena("Original");
	
	@Test
	void testPorDelante() {
		cad.cDelante("patata");
		assertEquals("patata Original", cad.getCadena());
	}

	@Test
	void testPorDetras() {
		cad.cDetras("hola");
		assertEquals("hola Original", cad.getCadena());
	}
	@Test
	void testEliminar() {
		cad.quitar("r");
		assertEquals("Oiginal", cad.getCadena());
	}
	@Test
	void testEliminarSelecto() {
		cad.quitar("i",1);
		assertEquals("Orginal", cad.getCadena());
	}


}
