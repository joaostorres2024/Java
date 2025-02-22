package Main;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 =  "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		Locale.setDefault(Locale.US);
		System.out.printf("Products: %s, which price is $ %.2f %n", product1, price);
		System.out.printf("Products: %s, which price is $ %.2f %n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		System.out.printf("US decimal point: %.2f", measure);
	}

}
