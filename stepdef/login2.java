package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login2 extends BaseClass {
		
	@And("enter the username as {string}")
	public void EnterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys (username);
	}

	@And("enter the password as {string}")
	public void EnterPassword(String password) {
		driver.findElement(By.id("password")). sendKeys (password);
	}
	@When("clicking the Login Button1")
	public void ClickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verifying the Landing page")
	public void VerifyLandingPage() {
		System.out.println(driver.getTitle());	
	}
	
@When("Error message should be displayed")
	public void error_message_hould_be_displayed() {
	   System.out.println("Error message should be displayed");
	}

	
	}


