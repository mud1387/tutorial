package tutorial;

public class implementInterface implements bankInterface, accountInterface{

	
	@Override
	public void mortgageCalculation() {
		// TODO Auto-generated method stub
		System.out.println("Implemented mortgage calculation. Year value=="+year+" interest Value=="+interest
				+"Loan amount value== "+loanAmount);
		
	}
	
	public static void main(String[] args) {
		
		implementInterface obj= new implementInterface();
		obj.mortgageCalculation();
		obj.openAcc();
	}

	@Override
	public void openAcc() {
		// TODO Auto-generated method stub
		System.out.println("Opened account");
		
	}
	


}
