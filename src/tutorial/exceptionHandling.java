package tutorial;


public class exceptionHandling {

	int a=3;
	
	public static void main  (String[] args) {
		
		exceptionHandling obj= new exceptionHandling();
		int divide=obj.a/0;
		System.out.println(divide);
		System.out.println("Passed");
		
	}
	

}
