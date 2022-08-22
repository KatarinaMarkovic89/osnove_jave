package d22_08_2022;

public class Knjiga {
//	Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor

	private String isbn;
	private String naziv;
	private int godina;
	private Autor autor;

//		-konstuktore koje mislite da su vam potrebni
	public Knjiga(String isbn, String naziv, int godina, Autor autor) {
		super();
		this.isbn = isbn;
		this.naziv = naziv;
		this.godina = godina;
		this.autor = autor;
	}

//	-gettere i settere za atribute
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
	public void printKnjiga() {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godina);
		System.out.print("Autor: ");
		this.autor.print();
	}

}
