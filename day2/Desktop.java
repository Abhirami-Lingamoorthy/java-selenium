package week3.day2;

public class Desktop implements Hardware,Software {
	public void desktopModels() {
		System.out.println("All in one Desktop");
	}

	public void softwareResources() {
		System.out.println("system software & Application software");
		
	}

	public void hardwareResources() {
		System.out.println("called as peripheral devices");
	}
		
		
	public static void main(String[] args) {
		
		Desktop size = new Desktop();
		size.desktopModels();
		size.hardwareResources();
		size.softwareResources();
	


}
}