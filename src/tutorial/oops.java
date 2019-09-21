package tutorial;

public class oops {

	String s;
	
	  oops(String s){ 
		  this.s=s; 
		  }
	  
	 
	void display(){
		s="Hello";
		System.out.println(s);
		
	}
	
	void display(int value){
		System.out.println("Display method--2");
		System.out.println(value);
	}
	
	void display(int value, int value1){
		System.out.println("Display method--3");
		int sum= value+value1;
		System.out.println(sum);
		
	}
	
	void display(int value, double value1){
		System.out.println("Display method--4");
		double sum= value+value1;
		System.out.println(sum);
	}
	
	String showVehicleName(String pq) {
		
		String vehicleName=pq;
		if (vehicleName.equalsIgnoreCase("Audi")) {
			System.out.println("Found");
			return vehicleName;
		}
		else {
			return "Nothing found";
		}
	}
	
	public static void main(String[] args) {
		
		oops obj= new oops("Hello");
		//obj.s="Hello";
		System.out.println(obj.s);
		//obj.display();
		
		//  obj.display(1); obj.display(1, 2.25); obj.display(1, 2);
		 		//String vehicle=obj.showVehicleName("audi");
		//System.out.println(vehicle);
	}
}
