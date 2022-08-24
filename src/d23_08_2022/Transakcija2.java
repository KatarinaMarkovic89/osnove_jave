package d23_08_2022;

public class Transakcija2 {
//	Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
	private String id;
	private Racun2 platilac;
	private Racun2 primalac;

//	gettere i settere
//	konstruktore
	public String getId() {
		return id;
	}

	public Racun2 getPlatilac() {
		return platilac;
	}

	public void setPlatilac(Racun2 platilac) {
		this.platilac = platilac;
	}

	public Racun2 getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun2 primalac) {
		this.primalac = primalac;
	}

	public Transakcija2(String id) {
		this.id = id;
	}

//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije,
//     znaci da metoda prima parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.

	private double provizija(double vrednost) {
		if (vrednost < 4500) {
			return 45;
		} else {
			return vrednost * 0.01;
		}
	}

//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. 
	// Kao parametar funkcije se unosi vrednost koja se prebacuje.
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), 
	// a na drugi racun dodaje samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava

	public void izvrsiTransakciju(double vrednost) {
		if (platilac.getStanjeTemp() > vrednost + this.provizija(vrednost)) {
			double novoStanjePlatilac = platilac.getStanjeTemp() - vrednost - this.provizija(vrednost);
			double novoStanjePrimalac = primalac.getStanjeTemp() + vrednost;
		} 
	}

//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna

	public void printTransakcija() {
		System.out.println(this.id);
		System.out.println("Racun sa: " + platilac.getIme() + " - " + platilac.getBrRacuna());
		System.out.println("Racun na: "+ primalac.getIme() + " - " + primalac.getBrRacuna());

	}
	
	

}
