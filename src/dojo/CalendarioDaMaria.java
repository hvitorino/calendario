package dojo;

import java.util.Calendar;
import java.util.Date;

public class CalendarioDaMaria {

	public boolean testarData(Date date) {
		return false;
	}

	public boolean isTercaFeira(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.TUESDAY) {
			return true;
		}

		return false;
	}
	
	public boolean isQuintaFeira(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.THURSDAY) {
			return true;
		}

		return false;
	}
	
	
	

}
