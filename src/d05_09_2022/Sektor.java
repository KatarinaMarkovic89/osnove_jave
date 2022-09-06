package d05_09_2022;

public class Sektor {
//	Kreirati klasu Sektor koja ima:
//		â—?	 naziv sektora
//		â—?	 platu koja je za taj sektor
	private String naziv;
	private double plata;

	public String getNaziv() {
		return naziv;
	}

	public double getPlata() {
		return plata;
	}

	public Sektor(String naziv, double plata) {
		super();
		this.naziv = naziv;
		this.plata = plata;
	}

}
