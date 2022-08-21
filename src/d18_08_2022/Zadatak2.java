package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		2.Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post
//			(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 
//			(broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> 
//			(ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i 
//			nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
		FacebookPost2 objava1 = new FacebookPost2();
		objava1.imePrezimeObjava = "Mita Mitic";
		objava1.imePrezimePost = "Pera Peric";
		objava1.tekst = "Na plavom tiganju neba, sunce na oko.";
		objava1.brojLajkova = 22;
		objava1.brojDeljenja = 5;
		objava1.like();
		objava1.dislike();
		objava1.share();
		
		objava1.print();
		System.out.println("******************************");
		
		FacebookPost2 objava2 = new FacebookPost2();
		objava2.imePrezimeObjava = "Marko Petrovic";
		objava2.imePrezimePost = "Laza Lazic";
		objava2.tekst = "Tucite decu bez razloga, jer su svi ostali razlozi gluplji.";
		objava2.brojLajkova = 42;
		objava2.brojDeljenja = 3;
		objava2.like();
		objava2.dislike();
		objava2.share();
		
		objava2.print();


	}

}
