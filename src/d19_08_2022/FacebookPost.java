package d19_08_2022;

public class FacebookPost {
//	1.Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		 Konstruktore:
//		difoltni konstuktor
//		konstuktor koji postavlja ime i prezime korisnika ko je objavio,
//	korisnika na kom je profilu objavnljen i tekst objave
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//		Primer stampanja:
//		Milan Jovanovic >>> Pera Peric
//		Ovo je tekst objave
//		Likes 3 | Shares 1
	private String imePrezimeObjava;
	private String imePrezimePost;
	private String tekst;
	private int brojLajkova;
	private int brojDeljenja;

	public FacebookPost() {
	}

	public FacebookPost(String objava, String post, String t) {
		this.imePrezimeObjava = objava;
		this.imePrezimePost = post;
		this.tekst = t;
	}

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void dislike() {
		if (this.brojLajkova >= 1) {
			this.brojLajkova = this.brojLajkova - 1;
		} else {
			this.brojLajkova = 0;
		}
	}

	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}

	public void print() {
		System.out.println(this.imePrezimeObjava + ">>>>>" + this.imePrezimePost);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.brojLajkova + "|" + "Shares " + this.brojDeljenja);
	}

}
