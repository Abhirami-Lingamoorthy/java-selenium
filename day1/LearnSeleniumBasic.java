package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasic {
	

	public static void main(String[] args) {
		// step 1=To set the path for the driver
		
		WebDriverManager.chromedriver().setup();
		// step 2 = Launch the Chrome browser by checking object
		ChromeDriver driver=new ChromeDriver();
	// step 2 = Loading the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// step 3 = to Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// step 4 = Find the password and alue
		driver.findElement(By.id("username")).sendKeys ("demosalesmanager");
		// step 5 = Find the password and values
		driver.findElement(By.id("password")). sendKeys ("crmsfa");
		// step 6 = Find the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		// step 7 = Click the CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//step 8 = Click the lead
		driver.findElement(By.linkText("Leads")).click();
		//step 9 = Click create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//step 10= Give input to companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//step 11 = Given input to the parent
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("Edward");
		//step 11 = Give Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		// step12 = Give last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("roseline");
		// step 13 = select source work with dropDown 
	WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select source = new Select(dropDown); //call the arguements
	source.selectByVisibleText("Cold Call");
	source.selectByVisibleText("Conference");
	source.selectByVisibleText("Direct Mail");
	source.selectByVisibleText("Employee");
	source.selectByVisibleText("Existing Customer");
	source.selectByVisibleText("Other");	
	source.selectByVisibleText("Partner");	
	source.selectByVisibleText("Public Relations");	
	source.selectByVisibleText("Self Generated");
	source.selectByVisibleText("Tradeshow");
	source.selectByVisibleText("Website");
	source.selectByVisibleText("Word of Mouth");
	source.selectByIndex(6);
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("XXXX");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium with java");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abhiramilingamoorthy93@mgail.com");
	WebElement dropDown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select state = new Select(dropDown1);
	state.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());

	
	}
    }


