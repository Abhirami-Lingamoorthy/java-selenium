package stepdef;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends BaseClass{
	
	    
	@When("Clicking the Leads Button")
	public void clickingTheLeadsButton() {
		 driver.findElement(By.linkText("Leads")).click();
	}
	@When("Clicking the MergeLeads")
	public void clickingTheMergeLeads() {
	    driver.findElement(By.linkText("Merge Leads")).click();
	}
	@When("Clicking the From Lead")
	public void clickingTheFromContact() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Thread.sleep(3000);
		Set<String> window1 = driver.getWindowHandles();
		List<String> allWin=new ArrayList<String>(window1);
		
		
		driver.switchTo().window(allWin.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allWin.get(0));
	
	}
	@When("Clicking the To Lead")
	public void clickingTheToLead() throws InterruptedException {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> window = driver.getWindowHandles();
		List<String> allWin1=new ArrayList<String>(window);
		
		
		driver.switchTo().window(allWin1.get(1));
		Thread.sleep(8000);
		//Actions act = new Actions(driver);
	 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
//		act.moveToElement(findElement).doubleClick();
		driver.switchTo().window(allWin1.get(0));
	}
	@Then("Clicking the Merge Button")
	public void clickingTheMergeButton() {
	    driver.findElement(By.linkText("Merge")).click();
	}
	@Then("clicking the AlertBox")
	public void clickingTheAlertBox() {
	    Alert alert1 = driver.switchTo().alert();
	    alert1.accept();
}
}
