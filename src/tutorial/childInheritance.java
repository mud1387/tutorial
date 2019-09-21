package tutorial;

public class childInheritance extends inheritance {

 int interest=3;
	
	void calInterest() {
		
		System.out.println(" class method:::"+ interest);
	}
	
	
public static void main(String[] args) {
		
		//inheritance inObj= new childInheritance();
		
		
		childInheritance childObj= new childInheritance();
		//childObj.calInterest();
		childObj.interestParent=45;
		childObj.calInterestParent();
		
	}

	
}
