package d18_08_2022;

import d18_08_2022.SmartAirConditioning3;

public class Zadatak3 {

	public static void main(String[] args) {
//
//3. (ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//atribut za mod (hladi/greje)
//metodu za stampu - stampa u formatu 
//marka - mod - termperatura
//metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//metodu koja racuna koliko klima novca potrosi za mesec dana
//Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//Metoda vraca ukupnu cenu za taj mesec
//
//U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
		SmartAirConditioning3 klima1= new SmartAirConditioning3();
		klima1.marka="LG";
		klima1.mod = "hladi";
		klima1.potrosnjaHladjenje = 3;
		klima1.potrosnjaGrejanje = 5;
		klima1.temp = 24;
		
		klima1.stampaj();
		klima1.mesecnaPotrosnja();
		System.out.println("Ova klima mesecno trosi " + klima1.cena());
		
		System.out.println("**********************************");
		SmartAirConditioning3 klima2= new SmartAirConditioning3();
		klima2.marka="Samsung";
		klima2.mod = "greje";
		klima2.potrosnjaHladjenje = 5;
		klima2.potrosnjaGrejanje = 2;
		klima2.temp = 26;
		
		klima2.stampaj();
		klima2.mesecnaPotrosnja();
		System.out.println("Ova klima mesecno trosi " + klima2.cena());


	}

}
