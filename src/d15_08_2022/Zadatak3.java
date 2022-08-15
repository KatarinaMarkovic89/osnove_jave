package d15_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije 
//		vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//		ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//		ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite prvi broj: ");
		int a = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int b = s.nextInt();
		int vrednost = novaVrednost(a, b);
		System.out.println("Nova vrednost je: " + vrednost);
		s.close();
	}

	public static int novaVrednost(int a, int b) {
		return a * 10 + b;
	}

}
