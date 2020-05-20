package org.aritmendiadrian.tema8.ej2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Utilidades {
	public static boolean esFinDeSemana(int dia, int mes, int anio) throws FechaException{
		boolean resultado = true;
		Calendar calendar = new GregorianCalendar();
		calendar.set(anio, mes, dia);
		if (anio<1900||(dia>1 && mes>1 && anio>3000)) {
			throw new FechaException("La fecha es incorrecta");
		}
		
		else {
			int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
			if (diaSemana==Calendar.SATURDAY||diaSemana==Calendar.SUNDAY) resultado = false;
			else resultado = true;
		}
	
		
		return resultado;
	}

}
