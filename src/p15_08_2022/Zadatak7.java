package p15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
//		7.Zadatak
//		Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//		Primer: Ako se metoda pozove za N=10, vraca -10
//			Ako se metoda pozove za N=-11, vraca 11

		int x = oppositeNumber(10);
		System.out.println(x);
	}
	public static int oppositeNumber(int number) {
		return -1*number;
	}
}
