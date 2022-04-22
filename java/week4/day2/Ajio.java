package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		//set the path
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	//get the url
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//search, type, enter
	driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	//driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	Thread.sleep(2000);
	//Print the count of the items Found.
	String TotalItems = driver.findElement(By.className("length")).getText();
	System.out.println("Total number of items : " + TotalItems);
	//list of brand of the products
	System.out.println("List of bag brands");
	List<WebElement> bagBrands = driver.findElements(By.className("brands"));
	System.out.println("size =" + bagBrands.size());
	for(WebElement name : bagBrands) {
		String text = name.getText();
		System.out.println(text);
		//Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println("Name of the bags");
		System.out.println("Size="+bagNameList.size());
		for (WebElement nameList : bagNameList) {
			String text2 = nameList.getText();
			System.out.println(text2);
			
		}
	}
			
	
	}

}
