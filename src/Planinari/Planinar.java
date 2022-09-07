package Planinari;

public abstract class Planinar {
//	Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 
//		jedinstveni celobrojni identifikacioni broj
//		ime i prezime 
	protected String id;
	protected String ime;
//		Dok od javnih metoda: 
//		konstruktor koji postavlja sve atribute klase. 
//	gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj.
//	posle njihovog postavljanja u konstruktoru)
	public Planinar(String id, String ime) {
		this.id = id;
		this.ime = ime;
	}
	public String getId() {
		return id;
	}
	public String getIme() {
		return ime;
	}
	

//		apstraktnu metodu štampaj
	public abstract void print();
//		apstraktnu metodu koja vraca clanarinu planinara
	public abstract double clanarina();
//		apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se 
//		planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina. 
	public abstract boolean uspesanUspon(Planina mount);

}
