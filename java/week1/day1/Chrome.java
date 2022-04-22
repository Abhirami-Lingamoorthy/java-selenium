package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");\\
	WebDriverManager.chromedriver().browserVersion("100.0.4896.60").setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/");
}
}
