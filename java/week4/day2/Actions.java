package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static void main(String[] args) {
		//setup path
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//get the url, maximize, implicitly wait
		driver.get("https://jqueryui.com//resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//get the web element/resize
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("resizable"));		
		
		//drag and drop		
		  WebElement element2 = driver.findElement(By.xpath("//div[contains(@class,' ui-icon-gripsmall-diagonal-se')]"));
		    
		
		    
	

		

	}

}
