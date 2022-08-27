package d26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Igrac i1 = new Igrac("Kristojano Ronaldo", "1234565", "1985");
		i1.setBroj("7");
		i1.setPozicija("napadac");
		i1.setKapiten(false);

		Trener t1 = new Trener("Zoze Murinjo", "4512668", "1963");
		t1.setGodineIskustva(20);
		t1.setTipTrenera("trener za igru");

		i1.print();
		System.out.println();
		t1.print();

		System.out.println();

		Igrac i2 = new Igrac("Nemanja Vidic", "1234521", "1981");
		i2.setBroj("15");
		i2.setPozicija("odbrana");
		i2.setKapiten(true);

		Trener t2 = new Trener("Dejan Stankovic", "451266", "1978");
		t2.setGodineIskustva(15);
		t2.setTipTrenera("trener za igru");

		i2.print();
		System.out.println();
		t2.print();

	}

}
