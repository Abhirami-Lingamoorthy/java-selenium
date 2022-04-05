package week3.day2;

public class College extends University{

	@Override
	public void pg() {
		
		}

	@Override
	public void ug() {
		System.out.println("Under Graduate");
		
	}


public static void main(String[] args) {
	College student = new College();
	student.pg();
	student.ug();

}
}