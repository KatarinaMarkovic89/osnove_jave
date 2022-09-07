package Ambalaza;

public class KupovinaMain {

	public static void main(String[] args) {
//		U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova
//		i istestirati sve metode i ispisati ukupnu cenu sa popustom.
		
		Korpa shop = new Korpa();
		
		Tetrapak mleko = new Tetrapak("123-456", "Mleko Kravica", 1, 1.1 , 120);
		mleko.setReciklaza(true);
		Tetrapak sok = new Tetrapak("321-654", "Vocne kapi", 1.5, 1.6 , 140);
		sok.setReciklaza(false);
		StaklenaAmbalaza pivo = new StaklenaAmbalaza("321-654", "Zajecarsko", 0.5, 0.7);
		pivo.setCena(60);
		pivo.setKaucija(50);
		StaklenaAmbalaza vino = new StaklenaAmbalaza("321-654", "Zdrepceva krv", 1, 1.3);
		vino.setCena(350);
		
		SuperKartica card = new SuperKartica("5468752", "Katarina", 200);
		
		shop.dodajAmbalazu(mleko);
		shop.dodajAmbalazu(sok);
		shop.dodajAmbalazu(pivo);
		shop.dodajAmbalazu(vino);
		
		System.out.println("U korpi imate: ");
		mleko.print();
		System.out.println();
		sok.print();
		System.out.println();
		pivo.print();
		System.out.println();
		vino.print();
		
		System.out.println("Ukupni iznos za naplatu je: " + shop.cenaKorpe(card));

	}

}
