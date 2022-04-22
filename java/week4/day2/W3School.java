package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {

	public static void main(String[] args) {
		//setup path
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//get URL, maximize, implicitlywait
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	//click the Try it
	driver.findElement(By.xpath("//button[@onclick='Try it']")).click();
	Alert alert = driver.switchTo().alert();
	//get the text from alertbox  and accept
	System.out.println(alert.getText());
	alert.accept();
	//validate the name
	alert.sendKeys("Hello Abhirami! How are you today?");
	}

}
