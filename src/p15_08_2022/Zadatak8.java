package p15_08_2022;

public class Zadatak8 {

	public static void main(String[] args) {

//8. Zadatak
//Napisati metodu koja proverava da li je trougao pravougli.
//Metoda prima stranice trougla i hipotenuzu trougla. 
//Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c
		boolean pravougli = triangle(3,4,5);
		System.out.println("Da li je trougao pravougli? " + pravougli);

	}
	public static boolean triangle(int a, int b, int c) {
		if(c * c == a * a + b * b) {
			return true;
		} return false;
	}

}
