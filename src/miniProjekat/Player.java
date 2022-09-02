package miniProjekat;

public class Player {
//	Kreirati klasu Player koja ima:
//		ime i prezime
	
	private String ime;
//		gettere i settere

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
//	konstuktore

	public Player(String ime) {
		this.ime = ime;
	}
	
	
//		metodu print, koja stampa ime i prezime igraca
	public void print() {
		System.out.print(this.ime);
	}
	



}
