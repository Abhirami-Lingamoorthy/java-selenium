package week2.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	// step 2 = Launch the Chrome browser by checking object
	FirefoxDriver driver=new FirefoxDriver();
// step 2 = Loading the URL
	driver.get("http://leaftaps.com/opentaps/control/main");
	// step 3 = to Maximize the window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
}
