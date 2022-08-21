package d19_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		FacebookPost post1 = new FacebookPost("Katarina Markovic", "Pera Peric", "Baci pogled na ovu stvar!");
		
		post1.like();
		post1.like();
		post1.dislike();
		post1.share();

		
		post1.print();
		
		System.out.println("******************************");
		
		FacebookPost post2 = new FacebookPost("Milan Milanovic", "Stefan Stefanovic", "Vidi sta sam iskopao!");
		post2.like();
		post2.like();
		post2.dislike();
		post2.dislike();
		post2.dislike();
		post2.share();
		
		post2.print();

	}

}
