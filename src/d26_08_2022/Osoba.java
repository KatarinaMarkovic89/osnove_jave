package d26_08_2022;

public class Osoba {
//	1.Zadatak
//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja

	protected String ime;
	protected String jmbg;
	protected String godinaRodjenja;

//	default-ni konstuktor
//	konstuktor sa parametrima
	public Osoba() {
		super();
	}

	public Osoba(String ime, String jmbg, String godinaRodjenja) {
		super();
		this.ime = ime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}

//	gettere i settere 

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(String godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)

	public void print() {
		System.out.println(this.ime + ", " + this.jmbg + ", " + this.godinaRodjenja);
	}

}
