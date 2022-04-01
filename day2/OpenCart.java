package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//launch the url.
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ id = 'input-username']")).sendKeys("Abhirami");
		driver.findElement(By.xpath("//input[@ id = 'input-firstname']")).sendKeys("Abhirami");
		driver.findElement(By.xpath("//input[@ id = 'input-lastname']")).sendKeys("Lingamoorthy");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("abhirami.lingamoorthy93@gmail.com");
		WebElement dropDown = driver.findElement(By.xpath("//input[@ id = 'input-country']"));
		Select country = new Select(dropDown);
        country.selectByVisibleText("India");
        driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("abhi-123456");
        driver.findElement(By.xpath("//input(contains[@text('Click or touch the), foot']")).click();
	}

}
