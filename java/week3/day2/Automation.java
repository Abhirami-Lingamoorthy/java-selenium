package week3.day2;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public void Selenium() {
		System.out.println("Selenium is a testing tool");
		
	}

	public void Java() {

		System.out.println("Java is a programming language");
	}

	@Override
	public void python() {
		
		
	}

	@Override
	public void ruby() {
	System.out.println("Ruby is a language");
		
	}
	public static void main(String[] args) {
	Automation tool = new Automation();
	tool.Java();
	tool.Selenium();
	tool.python();
	tool.ruby();

}
}
