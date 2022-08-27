package d25_08_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita

	private String brIndexa;
	private String imeStudenta;
	private String tipStudija;
	public ArrayList<Ispit> nizIspita = new ArrayList<Ispit>();
//	konstuktore koje mislite da ce vam trebati

//	gettere i settere za indeks, ime i prezime, tip studija
	public String getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}

	public String getImeStudenta() {
		return imeStudenta;
	}

	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

//	getter za niz predmeta
	public ArrayList<Ispit> getNizIspita() {
		return nizIspita;
	}

//	metodu dodaj ispit u niz ispita

	public void dodajIspit(Ispit noviIspit) {
		this.nizIspita.add(noviIspit);
	}

	int suma = 0;
	int brojac = 0;
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)

	public int sumaPolozenih() {
		for (int i = 0; i < this.nizIspita.size(); i++) {
			if (this.nizIspita.get(i).ispitPolozen() == true) {
				brojac++;
				suma = suma + this.nizIspita.get(i).getOcena();
			}

		}
		return suma;
	}

	public int racunajProsek() {

		return this.sumaPolozenih() / this.brojac;
	}
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	public void printStudent() {
		System.out.println(this.brIndexa + " - " + this.imeStudenta + " - " + this.tipStudija);
		System.out.println("Predmeti");
		for (int i = 0; i < this.nizIspita.size(); i++) {
			System.out.println(this.nizIspita.get(i).getNazivPredmeta() + " - " + this.nizIspita.get(i).getImeProfa()
					+ " - " + this.nizIspita.get(i).getOcena());
		}
		System.out.print("Prosecna ocena: " + this.racunajProsek());

	}

}
