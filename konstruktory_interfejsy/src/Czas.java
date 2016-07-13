
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Czas {

	public static void main(String[] args) {

          GregorianCalendar dzis = new GregorianCalendar();

		int rok = dzis.get(Calendar.YEAR);
		int dzien = dzis.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(dzien);
		
		System.out.println(rok);
		
		System.out.printf("%tc", dzis);
		
	}


}
