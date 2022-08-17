package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na
//			koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//
//
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i 
//			za svaki od njih pozvati metode
		SmartAirConditioning klima= new SmartAirConditioning();
		klima.marka="LG";
		klima.mod = "hladi";
		klima.temp = 24;
		
		klima.stampaj();
		
		if(klima.info(36)==true) {
			System.out.println("Napolju je veca temparatura nego unutra.");
		} else {
			System.out.println("Napolju nije veca temperatura");
		}
		
		System.out.println("*********************************");
		
		SmartAirConditioning klima2= new SmartAirConditioning();
		klima2.marka="Samsung";
		klima2.mod = "greje";
		klima2.temp = 36;
		
		klima2.stampaj();
		
		if(klima2.info(22)==true) {
			System.out.println("Napolju je veca temparatura nego unutra.");
		} else {
			System.out.println("Napolju nije veca temperatura");
		}


	}

}
