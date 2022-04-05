package week3.day2;

public class Mobile  {
	public void sendMsg()
	{
		System.out.println("Hi everyone");
	}
	public void makeCall()
	{
		System.out.println("Calling Abhi");
	}
	public void saveContact()
	{
		System.out.println("Abhi = 9000000099");
	}
 
	public static void main(String[] args) {
		Mobile number = new Mobile();
		number.sendMsg();
		number.makeCall();
		number.saveContact();
		
		

	}

}
