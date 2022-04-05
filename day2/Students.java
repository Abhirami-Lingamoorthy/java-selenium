package week3.day2;

public class Students
{
	public void getStudentInfo(int id)
	{
	System.out.println(id);	
	}
	public void getStudentInfo(int id , String name)
	{
		System.out.println(id+ name);
	}
	public void getStudentInfo(String email, long phno)
	{
		System.out.println(email+ phno);
	}

	public static void main(String[] args) {
		Students regnum = new Students();
		regnum.getStudentInfo(1028001);
		regnum.getStudentInfo(2854642, " Abhirami");
		regnum.getStudentInfo("abhirami.lingamoorthy93@gmail.com" , 9452678632l);
	}

}
