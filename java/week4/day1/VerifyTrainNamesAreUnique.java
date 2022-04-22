package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
		//setup path
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//get url
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click the sort on date
				driver.findElement(By.id("chkSelectDateOnly")).click();
				
		//clear from and to station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		//give values to the From & To and use the tab
		fromStation.sendKeys("Chennai Egmore",Keys.TAB,Keys.TAB);
		toStation.sendKeys("Madurai Jn",Keys.TAB);
		Thread.sleep(2000);
		
		//to find the No of trains
		List<WebElement> trainRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int size = trainRows.size();
		System.out.println("No of Trains=" +size);
		//train list table
		//WebElement trainList = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		//String trList = trainList.getText();
		//System.out.println("train List=" + trList);
		
		//empty list for add the train
		List<String> train = new ArrayList<String>();
		//find the no of Train names
		for (int i = 1; i <size; i++) {
			String trainNames = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
			train.add(trainNames);
			
			System.out.println(trainNames);
			// convert to size for compare
		}
			int size2 = train.size();
			System.out.println("Train names="+ size2);
			// compare no of trains and and no of train names and give the comment
			Set <String> trlist = new LinkedHashSet<String>(train);
			if(size==size2)
			{
				System.out.println("Have no Duplicate Train name");
			}
			else {
				System.out.println("Have Duplicate Train name");
			}
		
		}
		
		
	}
		
		

	

