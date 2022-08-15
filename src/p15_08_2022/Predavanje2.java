package p15_08_2022;

public class Predavanje2 {

	public static void main(String[] args) {
//		int z = sumiraj(10,20);
//		System.out.println(z);
		double x = multiply(10, 4);
		System.out.println(x);

	}

//void -> nepovratni
// int. double, String, ArrayList ---> povratni 
	//RETURN U BILO KOJOJ SITUACIJI
	//ne moze int i uslov if(a>5) jer ne vraca uvek
	//resava se drugim RETURN
//	
//	  if(a>5) {
//		  return a+b;
//	  }
//	  return 0;
	public static int sumiraj(int a, int b) {
		int zbir = a + b;
		return zbir;
	}
	public static double multiply(double a, double b) {
		return a*b;
	}
}
