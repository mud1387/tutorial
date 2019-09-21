package tutorial;

public class datatype {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		String x="alpha";
		char y='A';
		boolean z= true;
		float b= 48.12f;
		double d=43.76889890d;
		/*
		 * if (3>2) { System.out.println("Correct"); } else {
		 * System.out.println("incorrect"); }
		 */
		
		switch (x) {
		case "alpha":
			System.out.println("Alpha");
			break;
		case "bravo":
			System.out.println("Bravo");
			break;
		case "charlie":
			System.out.println("Charlie");
			break;
		default:
			System.out.println("Nothing found");
			break;
		}	
	}

}
