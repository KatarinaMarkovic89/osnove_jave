package d23_08_2022;

public class ZeleniKarton1 {
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10

	private String imeStudenta;
	private String brIndexa;
	private String nazivPredmeta;
	private String imeProfesora;
	private int ocena;

//gettere i settere
//konstruktore
	public String getImeStudenta() {
		return imeStudenta;
	}


	public String getBrIndexa() {
		return brIndexa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeProfesora() {
		return imeProfesora;
	}

	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	
public ZeleniKarton1(String imeStudenta, String brIndexa) {
		this.imeStudenta = imeStudenta;
		this.brIndexa = brIndexa;
	}

//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
	public boolean polozenIspit() {
		if (ocena > 5) {
			return true;
		}
		return false;
	}

//	metodu stampaj koja stampa podatke u formatu:
//	(naziv predmeta) - (ocena)
//	Student: ime i prezime, broj indeksa
//	Profesor: ime i prezime

	public void print() {
		System.out.println();
		System.out.println("*************************************");
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeStudenta + ", " + this.brIndexa);
		System.out.println("Profesor: " + this.imeProfesora);
		System.out.println("*************************************");
	}

}
