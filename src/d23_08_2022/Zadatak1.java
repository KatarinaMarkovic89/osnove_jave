package d23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		Scanner s = new Scanner(System.in);
		ArrayList<ZeleniKarton1> lista = new ArrayList<ZeleniKarton1>();

		System.out.print("Unesite ime studenta: ");
		String ime = s.nextLine();
		System.out.print("Unesite broj indeksa: ");
		String brIndeksa = s.nextLine();

		System.out.print("Unesite broj ispita: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite naziv ispita: ");
			String nazivIspita = s.next();
			System.out.print("Unesite ime profesora: ");
			String imeProfesora = s.next();
			System.out.print("Unesite ocenu: ");
			int ocena = s.nextInt();
			ZeleniKarton1 karton = new ZeleniKarton1(ime, brIndeksa);
			karton.setNazivPredmeta(nazivIspita);
			karton.setImeProfesora(imeProfesora);
			karton.setOcena(ocena);
			lista.add(karton);
		}

		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).print();
		}

// prosecna ocena za sve ispite

		int avgAll = 0;
		int avgPass = 0;
		int brojac = 0;
		int sumaPass = 0;
		int sumaAll = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			sumaAll = sumaAll + lista.get(i).getOcena();
			avgAll = sumaAll / lista.size();
		}

		System.out.println("Prosecna ocena svih ispita je " + avgAll);

// prosecna ocena polozenih
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).polozenIspit()) {
				brojac++;
				sumaPass = sumaPass + lista.get(i).getOcena();
				avgPass = sumaPass / brojac;
			}
		}

		System.out.println("Prosecna ocena svih polozenih ispita je " + avgPass);
		s.close();
	}

}
