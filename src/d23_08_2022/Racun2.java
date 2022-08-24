package d23_08_2022;

public class Racun2 {
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)

	private String brRacuna;
	private String ime;
	private double stanjeTemp;

	public Racun2(double stanjeTemp) {
		this.stanjeTemp = stanjeTemp;
	}

//	gettere i setter za sve atribute, sem settera za stanje na racunu
	public String getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getStanjeTemp() {
		return stanjeTemp;
	}

//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)

	public void promenaStanja(double vrednost) {
		if (this.stanjeTemp > vrednost) {
			this.stanjeTemp = this.stanjeTemp - vrednost;
			
		}
	}
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.

	public void printRacun() {
		System.out.println(this.ime + " - " + this.brRacuna);
		System.out.println("Stanje na racunu je " + this.stanjeTemp);
	}

}
