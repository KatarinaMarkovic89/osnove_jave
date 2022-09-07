package Planinari;

import java.util.ArrayList;

public class PlaninarskiDom {
//	(25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//		naziv doma 
//		godinu kada je osnovan. 
//		članove doma koji su planinari (klasa vodi računa o nizu) 

	private String naziv;
	private int godinaOsnivanja;
	private ArrayList<Planinar> nizPlaninara = new ArrayList<Planinar>();

//		Dok od javnih: 
//		default-ni konstuktor i konstuktor koji postavlja sve parametre 
//		gettere i settere koji su potrebni 
	public PlaninarskiDom() {
	}

	public PlaninarskiDom(String naziv, int godinaOsnivanja) {
		this.naziv = naziv;
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public ArrayList<Planinar> getNizPlaninara() {
		return nizPlaninara;
	}

//		metodu učlani planinara, koja dodaje planinara u niz 

	public void uclaniPlaninara(Planinar osoba) {
		this.nizPlaninara.add(osoba);
	}

//		metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu
//	(metoda za parametar prima Planinu za koju se proverava informacija) 
	public int brojUpona(Planina mount) {
		int brojac = 0;
		for (int i = 0; i < this.nizPlaninara.size(); i++) {
			if (this.nizPlaninara.get(i).uspesanUspon(mount)) {
				brojac++;
			}
		}
		return brojac;
	}

//		metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
	public void izbaciPlaninara(String id) {
		for (int i = 0; i < this.nizPlaninara.size(); i++) {
			if (this.nizPlaninara.get(i).getId().equals(id)) {
				this.nizPlaninara.remove(i);
			}
		}
	}
//		metodu koja štampa podatke o domu i o svim članovima doma

	public void print() {
		System.out.println("Dom: " + this.naziv + ", osnovan " + this.godinaOsnivanja);
		System.out.println("Clanovi: ");
		for (int i = 0; i < this.nizPlaninara.size(); i++) {
			this.nizPlaninara.get(i).print();
		}
	}

//	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
	public double prihod() {
		double prihod = 0;
		for (int i = 0; i < this.nizPlaninara.size(); i++) {
			prihod += this.nizPlaninara.get(i).clanarina();
		}
		return prihod;
	}

}
