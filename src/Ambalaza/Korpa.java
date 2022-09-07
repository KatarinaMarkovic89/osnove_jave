package Ambalaza;

import java.util.ArrayList;

public class Korpa {

//Kreirati klasu Korpa koja ima:
//niz ambalaza
	private ArrayList<Ambalaza> pak = new ArrayList<Ambalaza>();
//metodu dodaj ambalazu
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.pak.add(ambalaza);
	}
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
	
	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < pak.size(); i++) {
			if(this.pak.get(i).getBarcode().equals(barkod)) {
				this.pak.remove(pak.get(i));
			}
		}
		
	}
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
	private double cenaSvih(double popust) {
		double cena = 0;
		for (int i = 0; i < pak.size(); i++) {
			cena +=this.pak.get(i).cena();
			} return cena-popust;
	}
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije
//	se prima Super karticu iz koje se cita popust.
	public double cenaKorpe(SuperKartica kartica) {
		return this.cenaSvih(kartica.getPopust());
	}
	
	


}
