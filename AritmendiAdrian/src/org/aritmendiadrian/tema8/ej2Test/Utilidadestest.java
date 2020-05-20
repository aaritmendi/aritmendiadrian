package org.aritmendiadrian.tema8.ej2Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.aritmendiadrian.tema8.ej2.FechaException;
import org.aritmendiadrian.tema8.ej2.Utilidades;
class Utilidadestest {
	@Test
	void testanterior() throws FechaException {
		assertThrows(FechaException.class, () -> Utilidades.esFinDeSemana(1,7,1400));
	}
	@Test
	void testfail() throws FechaException {
		assertFalse(Utilidades.esFinDeSemana(20,5,2020));
	}
	@Test
	void testcorrecto() throws FechaException {
		assertTrue(Utilidades.esFinDeSemana(17,5,2020));
	}
}
