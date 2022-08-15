package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
//		5. Zadatak
//		Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.
		stampajApsolutnuVrednost(-5);
		stampajApsolutnuVrednost(5);
		stampajApsolutnuVrednost(-2);
		stampajApsolutnuVrednost(2);

	}

	public static void stampajApsolutnuVrednost(int x) {
		if (x < 0) {
			x = -1 * x;
		}
		System.out.println("Apsolutna vrednost je " + x + ".");
	}
}
