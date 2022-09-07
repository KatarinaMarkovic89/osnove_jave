package Ambalaza;

public class StaklenaAmbalaza extends Ambalaza {

//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena

	private double kaucija;
	private boolean placanjeKaucije;
	private double cena;
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni

	public double getKaucija() {
		return kaucija;
	}

	public boolean isPlacanjeKaucije() {
		return placanjeKaucije;
	}

	public double getCena() {
		return cena;
	}

	public StaklenaAmbalaza() {
		super();
	}

	public StaklenaAmbalaza(String barcode, String nazivArtikla, double netoTezina, double brutoTezina) {
		super(barcode, nazivArtikla, netoTezina, brutoTezina);
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public void setPlacanjeKaucije(boolean placanjeKaucije) {
		this.placanjeKaucije = placanjeKaucije;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	// racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flas
	@Override
	public double cena() {
		return this.placanjeKaucije ? (1.2 * this.cena + kaucija) : (1.2 * this.cena);
	}

	@Override
	public void print() {
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Barkod: " + this.barcode);
		System.out.println("Bruto tezina: " + this.brutoTezina);
		System.out.println("Neto tezina: " + this.netoTezina);
		if (this.placanjeKaucije) {
			System.out.println("Kaucija za flasu je: " + this.kaucija);
		}
		System.out.println("Cena je: " + this.cena());

	}

}
