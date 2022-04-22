package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShort {

	public static void main(String[] args) throws IOException  {
		//setup path
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	//get URL, maximize, implicitlywait
	driver.get("http://leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	//click the first frame and text	
	WebElement Frame1 = driver.findElement(By.id("Click"));
	Frame1.click();
	System.out.println(Frame1.getText());
	//getscreenshot and save file
	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	File image = new File("./snaps/frame.img.jpg");
	FileUtils.copyFile(screenshotAs, image);
	

	}

}
