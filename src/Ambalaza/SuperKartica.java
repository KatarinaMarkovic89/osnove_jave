package Ambalaza;

public class SuperKartica {

//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )

	private String brojKartice;
	private String ime;
	private double popust;

//konstuktore (default-ni i sa parametrima)
//gettere i settere 
	public SuperKartica(String brojKartice, String ime, double popust) {
		this.brojKartice = brojKartice;
		this.ime = ime;
		this.popust = popust;
	}

	public SuperKartica() {
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getPopust() {
		return popust;
	}

//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
public void print() {
	System.out.println(this.brojKartice + ", " + this.ime);
}
}
