package dojo.test;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import dojo.CalendarioDaMaria;

public class DadoUmCalendarioDaMaria {

	private CalendarioDaMaria calendario;
	
	@Test
	public void PossoTestarSeUmaDataEhDiaDaMaria() {
		calendario = new CalendarioDaMaria(); 
		
		assertTrue(calendario.testarData(new Date()));;
	}

}
