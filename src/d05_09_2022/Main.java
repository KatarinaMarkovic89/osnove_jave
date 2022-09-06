package d05_09_2022;

public class Main {

	public static void main(String[] args) {
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, 
//		postaviti sektore u kojima rade i ispisati platu za svakog

		Radnik menadzer = new Menadzer("Pera Peric");
		Radnik magacioner = new Magacioner("Mile Milic");

		Sektor s1 = new Sektor("kultura", 55000);
		Sektor s2 = new Sektor("IKT", 42000);
		Sektor s3 = new Sektor("Zajednicka sluzba", 36000);
		Sektor s4 = new Sektor("Galerija", 34000);
		
		menadzer.zaposliUSektor(s1);
		menadzer.zaposliUSektor(s2);

		magacioner.zaposliUSektor(s2);
		magacioner.zaposliUSektor(s3);
		magacioner.zaposliUSektor(s4);

		System.out.println(menadzer.getIme() + " ima platu " + menadzer.plata());
		System.out.println(magacioner.getIme() + " ima platu " + magacioner.plata());
		

	}

}
