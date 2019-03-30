package abstractclasses;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyPrinter {
	public static void main(String[] args) {
		double amount = 121231.9912312;
		//somehow you get an abstract reference
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		
		System.out.println(nf.format(amount));
		//here we see we actually get a child of NumberFormat as instance
		System.out.println(nf.getClass().getName());
	}
}
