package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		
		// step 1=To set the path for the driver
		
				WebDriverManager.chromedriver().setup();
				// step 2 = Launch the Chrome browser by checking object
				ChromeDriver driver=new ChromeDriver();
			// step 2 = Loading the URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				// step 3 = to Maximize the window
				driver.manage().window().maximize();
			    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();

	}

}
