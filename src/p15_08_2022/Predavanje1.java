package p15_08_2022;

public class Predavanje1 {

	public static void main(String[] args) {
		printCao("Milan","Jovanovic",27,170.5);//<--vrednost promenljive name/ARGUMENTI
		printCao("Ana", "Brankovic",25,165.8);
		printCao("Nikola","Milosavljevic",20,180.5);
		
	}
	
	public static void printCao(String firstName, String lastName,
			int godine, double x) { //zaglavlje metode, obavezne ( )<- dodajemo parametre
		
		System.out.println("Cao, " + firstName + " " + lastName + "!");
		System.out.println("Age: " + godine);
		System.out.println("Height: " + x);
	}
}
