package d05_09_2022;

public class Magacioner extends Radnik {

	// Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
	// â—? ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi
	// radnik kao:
	// â—? suma plata svih sektor / broj sektora * 0.5
	// â—? override uje metodu za platu, tako da se plata racuna po formuli:
	// (prosecna plata za sve sektore u kojima radi) * (broj sektora).

	public Magacioner(String ime) {
		super(ime);
	}

	double suma = 0;
	double prosecnaPlata;

	private double prosecnaPlata() {
		for (int i = 0; i < this.sektorNiz.size(); i++) {
			suma += this.sektorNiz.get(i).getPlata();
		}
		return prosecnaPlata = (suma / this.sektorNiz.size()) * 0.5;
	}

	@Override
	public double plata() {
		return this.prosecnaPlata() * this.sektorNiz.size(); //broj sektora se potire iz prosecne plate i ove plate, ostaje *	0.5
	}

}
