package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Ispit ispit1 = new Ispit("Kvantna" , 9 ,"Ivan Mancev");
		Ispit ispit2 = new Ispit("Atomska" , 9 ,"Ljilja Kostic");
		Ispit ispit3 = new Ispit("Osnoce Programiranja" , 5,"Pera Peric");
		
		Student student= new Student();
		student.setBrIndexa("1001");
		student.setImeStudenta("Katarina Markovic");
		student.setTipStudija("osnovne");
		
		
		student.dodajIspit(ispit1);
		student.dodajIspit(ispit2);
		student.dodajIspit(ispit3);
		
		student.printStudent();
		
		
		
		

	}

}
