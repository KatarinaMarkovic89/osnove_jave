package p15_08_2022;

public class Zadatak9 {

	public static void main(String[] args) {

//9.Zadatak
//Napisati metodu koja vrsi konverziju rimske(string) u
//arapske brojeve(int). 
//1 - I
//2 - II
//3 - III
//4 - IV
//5 - V
//
//Kao parametar se unosi vrednost rimkog broja(string) a
//vraca se arapski (int).
//Ako se unese V vraca se 5.
		
		int broj = rimskiArapski("V");
		System.out.println(broj);
	}

	public static int rimskiArapski(String x) {
		if (x.equals("I")) {
			return 1;
		} else if (x.equals("II")) {
			return 2;
		} else if (x.equals("III")) {
			return 3;
		} else if (x.equals("IV")) {
			return 4;
		} else if (x.equals("V")) {
			return 5;
		}
		return 0;
	}

}
