package week3.day2;

public class AndroidPhone extends Mobile
{
	public void takeVideo()
	{
		System.out.println("caputure the memorable moments");
	}

	public static void main(String[] args) {
		AndroidPhone model = new AndroidPhone();
		model.takeVideo();
		
		
	}

}
