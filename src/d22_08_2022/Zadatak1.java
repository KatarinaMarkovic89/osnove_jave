package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.
		
		Autor autor = new Autor("Dzon","Fante");
		Knjiga knjiga =new Knjiga("978-86-83499-98-4","Cekaj do proleca, Bandini",2008 ,autor);
		
		knjiga.printKnjiga();
		
		System.out.println();
		
		Autor autor2 = new Autor("Momo","Kapor");
		Knjiga knjiga2 =new Knjiga("974-84-82755-35-2","Ada", 1977 ,autor2);
		
		knjiga2.printKnjiga();	


	}

}
