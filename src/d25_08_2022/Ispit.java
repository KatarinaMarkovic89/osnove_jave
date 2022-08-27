package d25_08_2022;

public class Ispit {

//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet

	private String nazivPredmeta;
	private int ocena;
	private String imeProfa;
//konstuktore koje mislite da ce vam trebati

	// gettere i settere za sve atribute
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public Ispit(String nazivPredmeta, int ocena, String imeProfa) {
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.imeProfa = imeProfa;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getImeProfa() {
		return imeProfa;
	}

	public void setImeProfa(String imeProfa) {
		this.imeProfa = imeProfa;
	}

//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)

	public boolean ispitPolozen() {
		return this.ocena > 5 ? true : false;
	}

//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
	public void printIspit() {
		System.out.println(this.nazivPredmeta + " - " + this.imeProfa + " - " + this.ocena);
	}

}
