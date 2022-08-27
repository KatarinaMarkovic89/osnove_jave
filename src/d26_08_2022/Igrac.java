package d26_08_2022;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)

	private String broj;
	private String pozicija;
	private boolean kapiten;

//	default-ni konstuktor
//	konstuktor sa parametrima

	public Igrac() {
		super();
	}

//	gettere i settere za broj, kapiten i poziciju

	public Igrac(String ime, String jmbg, String godinaRodjenja) {
		super(ime, jmbg, godinaRodjenja);
		// TODO Auto-generated constructor stub
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public String stampaKapiten() {
		if (this.kapiten == true) {
			return "kapiten";
		}
		return "nije kapiten";
	}

//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	@Override
	public void print() {
		super.print();
		System.out.println(this.broj + ", " + this.pozicija + ",  " + this.stampaKapiten());
	}

}
