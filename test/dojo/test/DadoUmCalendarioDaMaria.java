package dojo.test;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertFalse;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import dojo.CalendarioDaMaria;

public class DadoUmCalendarioDaMaria {

	private CalendarioDaMaria calendario;
	
	@Before
	public void setUp() {
		calendario = new CalendarioDaMaria();
	}

	@Test
	public void confirmaTercaFeira() {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 23);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.YEAR, 2016);

		Date date = cal.getTime();

		assertTrue(calendario.isTercaFeira(date));
	}

	@Test
	public void confirmaDiaDiferenteTercaFeira() {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 22);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.YEAR, 2016);

		Date date = cal.getTime();

		assertFalse(calendario.isTercaFeira(date));
	}

	@Test
	public void devoVerificarSeEhQuintaFeira() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 25);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.YEAR, 2016);

		Date date = cal.getTime();
		
		assertTrue(calendario.isQuintaFeira(date));
	}
	
	@Test
	public void devoVerificarSeNaoEhQuintaFeira() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 26);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.YEAR, 2016);

		Date date = cal.getTime();
		
		assertFalse(calendario.isQuintaFeira(date));
	}
}