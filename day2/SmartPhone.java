package week3.day2;

public class SmartPhone extends AndroidPhone
{
	public void connectWhatsAp()
	{
		System.out.println("connect the whatsapp to the person");
	}
	  public void takeVideo()
	  {
		System.out.println("caputure the memorable moments");
	}

	public static void main(String[] args) {
		SmartPhone version = new SmartPhone();
		version.sendMsg();
		version.connectWhatsAp();
		version.makeCall();
		version.saveContact();
		version.takeVideo();
		
		

	}

}
