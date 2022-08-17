package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar 
//		prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. 
//		Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

		Proizvod proizvod = new Proizvod();
		proizvod.naziv = "Dimljeno carsko meso";
		proizvod.cena = 659.99;
		proizvod.masaGrami = 1250;
		
		proizvod.stampaj();
		
		System.out.println("Masa ovog proizvoda u kilogramima je " + proizvod.konvertuj("kg")+"kg.");
		System.out.println("Masa ovog proizvoda u tonama je " + proizvod.konvertuj("t")+"t.");
		
		System.out.println();
		
		Proizvod proizvod2 = new Proizvod();
		proizvod2.naziv = "Pasulj tetovac";
		proizvod2.cena = 259.99;
		proizvod2.masaGrami = 1500;
		
		proizvod2.stampaj();
		
		System.out.println("Masa ovog proizvoda u kilogramima je " + proizvod2.konvertuj("kg")+"kg.");
		System.out.println("Masa ovog proizvoda u tonama je " + proizvod2.konvertuj("t")+"t.");
	}

}
