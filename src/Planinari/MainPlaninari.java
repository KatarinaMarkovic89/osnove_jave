package Planinari;

public class MainPlaninari {

	public static void main(String[] args) {
//		U glavnom programu kreirati jedan planinarski dom, i u njemu 
//		učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3),
//		i istestirati svaku od metoda. 
		PlaninarskiDom dom = new PlaninarskiDom("Ajdanovac", 1952);
		Planina planina = new Planina("Besna Kobila", "Srbija", 1923);

		RekereativniPlaninar r1 = new RekereativniPlaninar("12345", "Katarina Markovic");
		r1.setMaxUspon(1500);
		r1.setOkrug("Nisavski");
		r1.setTezinaOpreme(20);
		RekereativniPlaninar r2 = new RekereativniPlaninar("34524", "Pera Peric");
		r2.setMaxUspon(2500);
		r2.setOkrug("Zajecarski");
		r2.setTezinaOpreme(25);
		RekereativniPlaninar r3 = new RekereativniPlaninar("1454", "Laza Lazic");
		r3.setMaxUspon(800);
		r3.setOkrug("Rasinski");
		r3.setTezinaOpreme(20);

		Alpinista a1 = new Alpinista("1458", "Sava Savic");
		a1.setPoeni(2);
		Alpinista a2 = new Alpinista("156486", "Djordje Djordjevic");
		a2.setPoeni(3);
		Alpinista a3 = new Alpinista("35465", "Marko Markovic");
		a3.setPoeni(4);

		dom.uclaniPlaninara(r1);
		dom.uclaniPlaninara(r2);
		dom.uclaniPlaninara(r3);
		dom.uclaniPlaninara(a1);
		dom.uclaniPlaninara(a2);
		dom.uclaniPlaninara(a3);

		dom.izbaciPlaninara("34524");

		dom.print();
		System.out.println("****************************************");
		System.out.println("Broj uspona na vrh " + planina.getIme() + " je: " + dom.brojUpona(planina));
		System.out.println("Prihodi doma su: " + dom.prihod());

	}

}
