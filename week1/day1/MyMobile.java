package week1.day1;

public class MyMobile {
	
	int phoneNum = 6854262;
	String Message = "hi everyone";
	double accountBalance = 123.35d;
	
	public void makeCall()
	{
		System.out.println(phoneNum);
	      
}
	public void sendMsg() 
	{
		System.out.println(Message);
	}
private void payBills()
{
  
  System.out.println(accountBalance);
}

	public static void main(String[] args) {
		MyMobile android= new MyMobile();
	
		android.makeCall();
		android.sendMsg();
		
		
		// TODO Auto-generated method stub

	}

};

