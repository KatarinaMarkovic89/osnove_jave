package p15_08_2022;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
//		10. Zadatak
//		Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji. 
//		Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) 
//		a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//		Primer poziva funkcija:
//		Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//		Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//		Primer izvrsenja main programa:
//		Unesite vrednost u eurima: 3
//		Unesite valutu za konverziju: RSD
//		3 EUR je 351.6339 RSD
//		Konverzija eura u druge valute:
//		1 EUR = 117.2113 RSD
//		1 EUR = 1.1821 USD
		//1 EUR = 62.98 RUB

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite vrednost u eurima: ");
		int vrednost = s.nextInt();
		System.out.print("Unesite valutu za konverziju: ");
		String valuta = s.next();
		double novaVrednost = convert(vrednost, valuta);
		System.out.println(vrednost + " EUR je " + novaVrednost + " " + valuta);
		s.close();

	}
	public static double convert(int vrednost, String valuta) {
		if(valuta.equals("RSD")) {
			double konvertVrednost = 117.2113 * vrednost;
			return konvertVrednost;
		}else if (valuta.equals("USD")) {
			double konvertVrednost = 1.1821 * vrednost;
			return konvertVrednost;
		}else if (valuta.equals("RUB")) {
			double konvertVrednost = 62.98 * vrednost;
			return konvertVrednost;
		} return vrednost;
	}
}
