package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass {

@When("Enter the username as {string}")
public void enterTheUsernameAs(String username) {
	driver.findElement(By.id("username")).sendKeys (username);
}
    
@When("Enter the password as {string}")
public void enterThePasswordAs(String password) {
	driver.findElement(By.id("password")). sendKeys (password);
}
@When("clicking the login button")
public void clickingTheLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
}
@When("clicking the CRMSFA link")
public void clickingTheCRMSFALink() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}
@When("Clicking the Leads button")
public void clickingTheLeadsButton() {
	 driver.findElement(By.linkText("Leads")).click();
}
@When("clicking the Lead ID {string}")
public void clickingTheLeadID(String string) {
	driver.findElement(By.linkText("abi")).click();
}
@Then("Clicking the Duplicate Lead")
public void clickingTheDuplicateLead() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
}
@Then("Clicking the Submit Button")
public void clickingTheSubmitButton() {
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
}
	
	@When("Clicking the FindLeads button")
	public void ClickingtheFindLeadsbutton() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Enter the FirstName as {string}")
	public void EntertheFirstName(String Firstname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(Firstname);
	}
	
	@Then("Clicking the FindLeads Button")
	public void ClickingtheFindLeadsButton() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@When("clicking the LeadID")
	public void clickingtheLeadID() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	}
	
	@Then ("Clicking the DuplicateLead")
	public void ClickingtheDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	
	@Then("ClickingtheSubmitButton")
	public void ClickingtheSubmitButton()	{	
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}
	@Then("Clicking the FindLeads")
	public void clickingTheFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("clicking the Lead ID")
	public void clickingTheLeadID() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	}
		
}
