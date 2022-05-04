package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
	@When("Clicking the CRMSFA link")
	public void clicking_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	
	 @When("Clicking the Leads link")
	public void clicking_the_leads_link() {
		 driver.findElement(By.linkText("Leads")).click();
			
	}
	    	
	@When("Clicking the CreateLead  link")
	public void clicking_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();	
	}
	    
	
	@When("Clincking the company name")
	public void clincking_the_company_name() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    
	}
	@When("Clicking the First name")
	public void clicking_the_first_name() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abhirami");
	    
	}
	@When("Clicking the Lastname")
	public void clicking_the_lastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lingamoorthy");
	   
	}
	@When("Clicking the create lead button")
	public void clicking_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	    
	}
	@Then("viewlead page should be displayed")
	public void viewlead_page_should_be_displayed() {
		  System.out.println(driver.getTitle());
	    
	
	}
}
