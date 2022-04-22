package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		//get URL, maximize, implicitlyWait
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//give user name and password and login
		driver.findElement(By.id("username")).sendKeys ("demosalesmanager");
		driver.findElement(By.id("password")). sendKeys ("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click the leads button
		driver.findElement(By.linkText("Contacts")).click();
		//go to merge leads
		driver.findElement(By.xpath("//a[text()='Merge Contacts')")).click();
		//first window
		driver.findElement(By.xpath("//img[@alt='Lookup']//a[1]")).click();
		
		//window handle-- next window2
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> mainWindow = new ArrayList<String>(windowHandles);
		String onewindow = mainWindow.get(1);//new window 
		driver.switchTo().window(onewindow);//control to new window
		//from  contact
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		driver.switchTo().window(mainWindow.get(0));//control switchTo mainwindow(Base)
		
		//get Second contact
		driver.findElement(By.xpath("//img[@alt='Lookup']//a[2]")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(windowHandles2);
		String secWindow = newWindow.get(1);// new window
		driver.switchTo().window(secWindow);//control to new Window
		
		//to Contact
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[2]")).click();
		driver.switchTo().window(newWindow.get(0));//control SwitchTo main Window(Base)
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.getTitle();
		
		
		
		

	}

}
