package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//get url maximize, implicitlywait
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//
		WebElement item1 = driver.findElement(By.xpath("//li[@text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[@text()='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//li[@text()='Item 4']"));
		WebElement item6 = driver.findElement(By.xpath("//li[@text()='Item 6']"));

	}

}
