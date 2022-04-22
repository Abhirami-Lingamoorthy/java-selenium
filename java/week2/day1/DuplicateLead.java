package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys ("demosalesmanager");
		
		driver.findElement(By.id("password")). sendKeys ("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//step 9 = Click create Lead
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		//step 10= Give input to companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//step 11 = Give Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		// step12 = Give last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("roseline");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("XXXX");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium with java");	
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abhiramilingamoorthy93@mgail.com");
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(dropDown1);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
	
		
		
	
	}

}
