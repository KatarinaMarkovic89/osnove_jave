package Planinari;

public class Alpinista extends Planinar{
//	 Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. 
//	 Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) 
//	 i poeni se mogu menjati. 
	
	private int poeni;
	
	public Alpinista(String id, String ime) {
		super(id, ime);
	}
	public int getPoeni() {
		return poeni;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

//	 informacije o alpinisti se ispisuju u formatu: 
//		 Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)
	@Override
	public void print() {
		System.out.println("Alpinista, id: " + this.id + " ime: " + this.ime + " Broj poena: " + this.poeni);
	}
//	 placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
	@Override
	public double clanarina() {
		return 1500-this.poeni*50;
	}
//	Alpinista može da savlada sve uspone do 4000 metara, 
	@Override
	public boolean uspesanUspon(Planina mount) {
		return mount.getVisina()<=4000 ? true:false;
	}

}
