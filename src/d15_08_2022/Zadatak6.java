package d15_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
//		Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//		Primer izvrsenja: 
//		izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//		izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//		Napomena: Resiti bez koriscenja petlji. 
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite prvi broj: ");
		int a = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int b = s.nextInt();
		int brojCelih = izbroji(a,b);

		System.out.println("Izmedju ovih brojeva postoji " + brojCelih + " celih brojeva.");
		
		s.close();
	}

	public static int izbroji(int a, int b) {
		return b - a - 1;
	}

}
