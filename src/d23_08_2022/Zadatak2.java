package d23_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Racun2 platilac = new Racun2(125456.50);
		platilac.setIme("Pera Peric");
		platilac.setBrRacuna("120-45897-25");
		
		Racun2 primalac = new Racun2(25859.60);
		primalac.setIme("Mile Milic");
		primalac.setBrRacuna("840-356003-33");
		
		Transakcija2 transakcija = new Transakcija2("1234");
		transakcija.setPlatilac(platilac);
		transakcija.setPrimalac(primalac);
		
		transakcija.izvrsiTransakciju(5000.00);
		
		
		platilac.promenaStanja(5000.00);
		platilac.printRacun();
		
	
		transakcija.printTransakcija();
		

	}

}
