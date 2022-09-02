package miniProjekat;

import java.util.Scanner;

public class XandOMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Player playerX = new Player("Katarina Markovic");
		Player playerO = new Player("Milan Stamenov");
		XandOGame game = new XandOGame();
		game.setPlayerX(playerX);
		game.setPlayerO(playerO);

		game.startGame();
		System.out.println("Dobrodosli!");
		

		while (game.isGameOver() == false) {
			
			System.out.println("Na redu je igrac " + game.getNextPlayer().getIme() + ".");
			System.out.print("Unesite poziciju koju zelite da odigrate(0-8): ");
			int position = s.nextInt();

			if (game.isValidMove(position) == true && game.isFieldFree(position) == true) {
				game.makeAMove(position);
				game.printTable();
				game.playNext();
				
			} else {
				System.out.println("Polje nije validno. Odigrajte drugo polje. ");
				System.out.println();
			}
			
			if (game.isWinnerX() == true || game.isWinnerO()) {
				break;
			}
		}
		game.scorePrint();
		s.close();
	}
	

}
