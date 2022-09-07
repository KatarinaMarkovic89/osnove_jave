package Planinari;

public class RekereativniPlaninar extends Planinar {
//	Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. Klasa dodatno
//	pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru: 
//		težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//		naziv okruga odakle je rekreativni planinar. 
//		maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
	private int tezinaOpreme;
	private String okrug;
	private double maxUspon;

	public RekereativniPlaninar(String id, String ime) {
		super(id, ime);
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public void setTezinaOpreme(int tezinaOpreme) {
		this.tezinaOpreme = tezinaOpreme;
	}

	public String getOkrug() {
		return okrug;
	}

	public void setOkrug(String okrug) {
		this.okrug = okrug;
	}

	public double getMaxUspon() {
		return maxUspon;
	}

	public void setMaxUspon(double maxUspon) {
		this.maxUspon = maxUspon;
	}

	// rekeativci placaju clanarinu u iznosu od 1000 rsd @Override
	public double clanarina() {
		return 1000;
	}
//	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov n
//	ajveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za 
//	svaki kilogram opreme koji nosi može da pređe 50 metara manje. 

	@Override
	public boolean uspesanUspon(Planina mount) {
		return (this.maxUspon < mount.getVisina()- this.tezinaOpreme * 50 ) ? true : false;
	}

//	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//	Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug) 

	@Override
	public void print() {
		System.out.println("Rekreativac , id: " + this.id + " ime: " + this.ime + " Okrug: " + this.okrug);

	}

}
