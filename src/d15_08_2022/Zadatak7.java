package d15_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
//		(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//		U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite prvi broj: ");
		int a = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int b = s.nextInt();
		System.out.print("Unesite treci broj: ");
		int c = s.nextInt();

		int minVrednost = minimum(a, b, c);
		System.out.println("Najmanji broj je " + minVrednost + ".");

		s.close();
	}

	public static int minimum(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		}
		return c;
	}
}
