package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead extends BaseClass{

		
@When("Clicking the FindLeads link")
		public void clickingTheFindLeadsLink() {
			driver.findElement(By.linkText("Find Leads")).click();
			
		   }
		@When("Clicking the Lead ID")
		public void clickingTheLeadID() {
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		    
		}
		@When("Clicking Edit button")
		public void clickingEditButton() {
			driver.findElement(By.linkText("Edit")).click();
		}
		@Test(retryAnalyzer=RetryFailedTestCase.class)
		@When("clear the companyname")
		public void clearTheCompanyname() {
			driver.findElement(By.xpath("//input[@value='companyName']")).clear();
		    
		}
		@Given("the important note")
		public void theImportantNote() {
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("CLEAR THE TEXT");
		}
		
		@Then("clicking the submit button")
		public void clickingTheSubmitButton() {
			driver.findElement(By.name("submitButton")).click();
		}
}

		    

		
		