package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop {

	public static void main(String[] args) {
		//setup path
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				//get url maximize, implicitlywait
				driver.get("http://www.leafground.com/pages/drop.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//
				driver.switchTo().frame(0);
				WebElement element = driver.findElement(By.id("draggable"));
				WebElement element2 = driver.findElement(By.id("droppable"));
				

	}

}
