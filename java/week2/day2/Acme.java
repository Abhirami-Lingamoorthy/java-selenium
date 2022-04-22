package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {

	public static void main(String[] args) {
		//launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//launch the url.
		driver.get("https://acme-test.uipath.com/login");
		//enter the user email id
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("kumar.testleaf@gmail.com");
		//enter the password
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("leaf@12");
		//click login
		driver.findElement(By.xpath("//button[@ type = 'submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
	}

}
