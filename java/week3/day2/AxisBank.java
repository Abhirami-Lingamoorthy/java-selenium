package week3.day2;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("9% interest");
	}

	public static void main(String[] args) {
		//overriding
		AxisBank branch = new AxisBank();
		branch.deposit();
		branch.fixed();
		branch.saving();
		
		

	}

}
