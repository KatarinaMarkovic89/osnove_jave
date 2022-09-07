package Ambalaza;

public class Tetrapak extends Ambalaza {
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena

	private boolean reciklaza;
	private double cena;
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni

	public Tetrapak(String barcode, String nazivArtikla, double netoTezina, double brutoTezina, double cena) {
		super(barcode, nazivArtikla, netoTezina, brutoTezina);
		this.cena = cena;
	}
	public boolean isReciklaza() {
		return reciklaza;
	}

	public double getCena() {
		return cena;
	}
	
	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.


	@Override
	public double cena() {
		return this.reciklaza ? (1.5 * this.tezina() + this.cena) : cena;
	}

	@Override
	public void print() {
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Barkod: " + this.barcode);
		System.out.println("Bruto tezina: " + this.brutoTezina);
		System.out.println("Neto tezina: " + this.netoTezina);
		System.out.println("Cena je: " + this.cena());
	}

}
