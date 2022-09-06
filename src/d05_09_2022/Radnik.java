package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//		â—?	 ime i prezime
//		â—?	 niz sektora u kojima radi
//		â—?	 abstraktnu metodu koja vraca platu radnika
//		â—?	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	protected String ime;
	protected ArrayList<Sektor> sektorNiz = new ArrayList<Sektor>();

	public String getIme() {
		return ime;
	}

	public ArrayList<Sektor> getSektorNiz() {
		return sektorNiz;
	}



	public Radnik(String ime) {
		this.ime = ime;
	}

	public abstract double plata();

	public void zaposliUSektor(Sektor sektor) {
		this.sektorNiz.add(sektor);
	}

}
