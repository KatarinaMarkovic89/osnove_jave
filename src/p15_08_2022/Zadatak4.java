package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. 
//		Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima. 
		racun(15,10);
		racun(105,5);
		racun(120,30);

	}
	
	public static void racun(int x, int y) {
		int zbir = x+y;
		int razlika = x-y;
		int proizvod = x*y;
		int kolicnik = x/y;
		System.out.println("Za brojeve " +x + " i "+y + ":");
		System.out.println("Zbir je " + zbir + ".");
		System.out.println("Razlika je "+ razlika+ ".");
		System.out.println("Proizvod je " + proizvod+ ".");
		System.out.println("Kolicnik je " + kolicnik+ ".");
		System.out.println();
	}

}
