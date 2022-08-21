package d18_08_2022;


public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju 
//		treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija 
//		nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, 
//		a povratnu vrednost je cena proizvoda kada se uračuna popust.
//		Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu 
//		od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod
//		šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena 
//		postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati 
//		svaku od definisanih funkcija.
		Proizvod1 proizvod = new Proizvod1();
		proizvod.naziv = "Dimljeno carsko meso";
		proizvod.cena = 659.99;
		proizvod.masaGrami = 300;
		
		proizvod.stampaj();
		proizvod.povecajCenu(50);
		
		System.out.println("Cena ovog proizvoda nakon popusta od 15% je " + proizvod.vratiCenuSaPopustom(15)+"din.");
		System.out.println("Postarina za ovaj proizvod je " + proizvod.racunajPostarinu()+"din.");
		
		System.out.println();
		
	
		Proizvod1 proizvod2 = new Proizvod1();
		proizvod2.naziv = "Sladoled Quatro";
		proizvod2.cena = 379.99;
		proizvod2.masaGrami = 1000;
		
		proizvod2.stampaj();
		
		System.out.println("Cena ovog proizvoda nakon popusta od 20% je " + proizvod2.vratiCenuSaPopustom(20)+"din.");
		System.out.println("Postarina za ovaj proizvod je " + proizvod2.racunajPostarinu()+"din.");

	}

}
