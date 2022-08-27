package d26_08_2022;

public class Trener extends Osoba {

//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)

	private int godineIskustva;
	private String tipTrenera;

	public Trener() {
		super();
	}

	public Trener(String ime, String jmbg, String godinaRodjenja) {
		super(ime, jmbg, godinaRodjenja);
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	// metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve
	// informacije o treneru
	@Override
	public void print() {
		super.print();
		System.out.println(this.godineIskustva + ", " + this.tipTrenera);
	}

}
