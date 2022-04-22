package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//get url maximize, implicitlywait
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("span[@text()='Men's Fashion']")).click();
		driver.findElement(By.xpath("//span[@text()='Sports Shoes']")).click();
		String shoeItems = driver.findElement(By.className("category-name category-count")).getText();
		System.out.println("No of sports Shoes="+ shoeItems);
		driver.findElement(By.xpath("//a[text()='Training Shoes']")).click();
		WebElement sortBy = driver.findElement(By.xpath("//span[text()='Sort by:']"));
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		
	}

}
