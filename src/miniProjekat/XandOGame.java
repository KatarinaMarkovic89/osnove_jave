package miniProjekat;

import java.util.ArrayList;

public class XandOGame {
//	table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//			nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//			playerX - igrac X
//			playerO - igrac O

	private ArrayList<String> table = new ArrayList<String>();
	private Player nextPlayer;
	private Player playerX;
	private Player playerO;

//	Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
	public XandOGame() {
		for (int i = 0; i < 9; i++) {
			table.add(" ");
		}
	}

//	Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi 
//i difoltni samo sto dodatno postavlja i igraca

	public XandOGame(Player playerX, Player playerO) {
		this.playerX = playerX;
		this.playerO = playerO;
	}

//	gettere i settere za igrace
	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public Player setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
		return nextPlayer;
	}

//	Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. 
//Ako je niz iz primera iznad stampa izgleda:
//	x | x | 0 |
//	0 | x | 0 |
//	x | 0 | x |


	public void printTable() {
		for (int i = 0; i < table.size(); i = i + range) {
			for (int j = i; j < i + range; j++) {
				System.out.print(table.get(j) + " | ");

			}
			System.out.println();
		}
	}

//	Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ 
//	i zatim postavlja da je na redu igrac X.

	public void startGame() {
		for (int i = 0; i < table.size(); i++) {
			table.set(i, " ");
		}
		this.setNextPlayer(this.playerX);
	}

//	Metodu isGameOver, igra je gotova ako su sva polja popunjena.
	public boolean isGameOver() {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).equals(" ")) {
				return false;
			}
		}
		return true;
	}

//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. 
//	Metoda od parametara prima niz i poziciju za kojju se proverava. 
//	Polje je slobodno ako u njemu ne pise x ili o

	public boolean isFieldFree(int position) {
		return table.get(position).equals(" ") ? true : false;
	}
//	Metodu isValidMove koja vraca informaciju da li je pozicija na koju 
//	igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8

	public boolean isValidMove(int position) {
		return position >= 0 && position < table.size() ? true : false;

	}

//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto
	public Player playNext() {
		if (getNextPlayer() == playerX) {
			return this.setNextPlayer(playerO);
			
		}
		return this.setNextPlayer(playerX);
	}
//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//	Ako je trenutno stanje u igri i sledeci na redu je igrac x

	public void makeAMove(int position) {

		if (this.getNextPlayer() == playerO) {
			table.set(position, "O");
		} else {
			table.set(position, "X");
		}

	}

//	Metodu isWinnerX - metoda vraca rezultat igre za igraca X. 
//	Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
	
	
	
	//Pesacki, prosto, neelegantno, samo za matrinca ranga range = 3
//	public boolean isWinnerX() {
//		if (table.get(0).equals("X") && table.get(1).equals("X") && table.get(2).equals("X")
//				|| table.get(3).equals("X") && table.get(4).equals("X") && table.get(5).equals("X")
//				|| table.get(6).equals("X") && table.get(7).equals("X") && table.get(8).equals("X")
//				|| table.get(0).equals("X") && table.get(3).equals("X") && table.get(6).equals("X")
//				|| table.get(1).equals("X") && table.get(4).equals("X") && table.get(7).equals("X")
//				|| table.get(2).equals("X") && table.get(5).equals("X") && table.get(8).equals("X")
//				|| table.get(0).equals("X") && table.get(4).equals("X") && table.get(8).equals("X")
//				|| table.get(2).equals("X") && table.get(4).equals("X") && table.get(6).equals("X")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public boolean isWinnerO() {
//		if (table.get(0).equals("O") && table.get(1).equals("O") && table.get(2).equals("O")
//				|| table.get(3).equals("O") && table.get(4).equals("O") && table.get(5).equals("O")
//				|| table.get(6).equals("O") && table.get(7).equals("O") && table.get(8).equals("O")
//				|| table.get(0).equals("O") && table.get(3).equals("O") && table.get(6).equals("O")
//				|| table.get(1).equals("O") && table.get(4).equals("O") && table.get(7).equals("O")
//				|| table.get(2).equals("O") && table.get(5).equals("O") && table.get(8).equals("O")
//				|| table.get(0).equals("O") && table.get(4).equals("O") && table.get(8).equals("O")
//				|| table.get(2).equals("O") && table.get(4).equals("O") && table.get(6).equals("O")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	
	//Postavljanjem range!=3, reciklirajuce i za matrice razlicitog ranga
	
	private boolean match;
	private int range = 3;
	
	public boolean winRow(String play) {
		for (int i = 0; i < this.range; i++) {
			match = true;
			for (int j = 0; j < this.range; j++) {
				match = match && this.table.get(i * range + j).equals(play);
			}
			if (match) {
				return true;
			}
		}
		return false;
	}

	public boolean winColumn(String play) {
		for (int i = 0; i < this.range; i++) {
			match = true;
			for (int j = 0; j < this.range; j++) {
				match = match && this.table.get(i + j * range).equals(play);
			}
			if (match) {
				return true;
			}
		}
		return false;
	}

	public boolean winCross1(String play) {
		match = true;
		for (int i = 0; i < range; i++) {
			match = match && this.table.get(i * (range + 1)).equals(play);
		}
		if (match) {
			return true;
		}
		return false;
	}

	public boolean winCross2(String play) {
		match = true;
		for (int i = 0; i < range; i++) {
			match = match && this.table.get((i + 1) * (range - 1)).equals(play);
		}
		if (match) {
			return true;
		}
		return false;
	}

	public boolean isWinnerX() {
		if (this.winRow("X") == true 
				|| this.winColumn("X") == true 
				|| this.winCross1("X") == true
				|| this.winCross2("X") == true) {
			return true;
		}
		return false;
	}

	public boolean isWinnerO() {
		if (this.winRow("O") == true 
				|| this.winColumn("O") == true 
				|| this.winCross1("O") == true
				|| this.winCross2("O") == true) {
			return true;
		}
		return false;
	}
	
//	Metodu gameScore, metoda vraca informaciju za kraj igre.
//	Ukoliko je pobednik igrac x, metoda vraca 1
//	Ukoliko je pobednik igrac o, metoda vraca 2
//	Ukoliko nemam pobednika vracamo 0

	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		} else if (this.isWinnerO() == true) {
			return 2;
		} else {
			return 0;
		}
	}

	public void scorePrint() {

		if (this.gameScore() == 1) {
			System.out.println("Pobednik je " + playerX.getIme() + "!");
		} else if (this.gameScore() == 2) {
			System.out.println("Pobednik je " + playerO.getIme() + "!");
		} else {
			System.out.println("Igra je neresena. Pokrenite ponovo za novu turu, novu avanturu!");
		}

	}

}
