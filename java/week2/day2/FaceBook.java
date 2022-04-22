package week2.day2;

import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class FaceBook {
			

			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get( "https://en-gb.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.linkText("Create New Account")).click();
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abhirami");
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lingamoorthy");
				driver.findElement(By.xpath("//input[@id ='password_step_input']")).sendKeys("abhi8754649231");
				WebElement dropdown = driver.findElement(By.id("day"));
				Select date =new Select(dropdown);
				date.selectByVisibleText("6");
				WebElement dropdown1 = driver.findElement(By.id("month"));
				Select month =new Select(dropdown1);
				month.selectByVisibleText("Aug");
				WebElement dropdown2 = driver.findElement(By.id("year"));
				Select year = new Select(dropdown2);
				year.selectByValue("1993");
				driver.findElement(By.name("sex")).click();
				}

			}


