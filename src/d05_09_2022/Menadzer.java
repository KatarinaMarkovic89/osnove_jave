package d05_09_2022;

public class Menadzer extends Radnik {

//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	â—?	 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	public Menadzer(String ime) {
		super(ime);
	}

	double plata = 0;

	@Override
	public double plata() {
		for (int i = 0; i < this.sektorNiz.size(); i++) {
			this.plata += this.sektorNiz.get(i).getPlata();
		}
		return this.plata;
	}

}
