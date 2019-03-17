
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		while(true)
		{
			String[] dayOfaWeekStr = {"", "Niedziela","Poniedzia�ek","Wtorek","�roda","Czwartek","Pi�tek","Sobota"};
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Wpisz dat� w formacie dd/mm/yyyy");
	        String dateString = scanner.nextLine();
	        System.out.println("Wpisana data to: " + dateString);    
	        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
	        Date date = null;
			try {
				date = formatDate.parse(dateString);
			} catch (ParseException e) {
				System.out.println("Z�y format daty! Podaj poprawny format daty.");
				return; // zeby uniknac wyrzucenia wyjatku w konsoli
			}				
			GregorianCalendar c = (GregorianCalendar) GregorianCalendar.getInstance();
	        c.setTime(date);
	        int dayOfaWeekInt = c.get(GregorianCalendar.DAY_OF_WEEK);      
	        System.out.println(dateString + " to " +  dayOfaWeekStr[dayOfaWeekInt]); 
	        c.add(GregorianCalendar.YEAR, 1); // dodajemy rok
	        dayOfaWeekInt = c.get(GregorianCalendar.DAY_OF_WEEK);  
	        System.out.println("Za rok tego dnia b�dziemy mieli: " + dayOfaWeekStr[dayOfaWeekInt]); 
		}
	}

}
