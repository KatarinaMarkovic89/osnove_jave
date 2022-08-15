package p15_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		3.Napisati dve metode:
//			- Prva metoda koja stampa zvezdicu sa razmakom. 
//		- Druga metoda koja stampa samo novi red.
//		U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
//		*  *  * 
//		*  *  
//		*  
//		zvezdica();
//		zvezdica();
//		zvezdica();
//		newLine();
//		zvezdica();
//		zvezdica();
//		newLine();
//		zvezdica();
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite N: ");
		int n = s.nextInt();

		while (n != 0) {
			for (int i = 0; i < n; i++) {
				zvezdica();
			}
			newLine();
			n--;
		}
		s.close();
	}

	public static void zvezdica() {
		System.out.print(" * ");
	}

	public static void newLine() {
		System.out.println();
	}
}
