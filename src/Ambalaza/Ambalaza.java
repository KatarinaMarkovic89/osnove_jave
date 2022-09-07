package Ambalaza;

public abstract class Ambalaza {
//	Kreirati abstraktnu klasu Ambalaza koja ima:
//		barkod (primer: 328232-2823)
//		naziv artikla
//		neto tezinu
//		bruto tezinu

	protected String barcode;
	protected String nazivArtikla;
	protected double netoTezina;
	protected double brutoTezina;
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere

	public Ambalaza() {
	}

	public Ambalaza(String barcode, String nazivArtikla, double netoTezina, double brutoTezina) {
		this.barcode = barcode;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public String getBarcode() {
		return barcode;
	}

	public String getNazivArtikla() {
		return nazivArtikla;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}
	
	
//		metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
	public double tezina() {
		return this.brutoTezina - this.netoTezina;
	}
//		abstraktnu metodu koja vraca cenu artikla
	public abstract double cena();
//		abstraktnu metodu stampaj
	public abstract void print();

}
