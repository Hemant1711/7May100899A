package mod1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTours {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_85.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("http://demo.guru99.com/test/newtours/");
		
		//Find Elements
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("submit")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.name("findFlights")).click();
		//String str1="Checking Confirmation";
		//if(driver.getPageSource().contains("No Seats Avaialble"))
			if(driver.getPageSource().contains("No Seats Avaialble"))
		{
			System.out.println("Sorry there are no seats available");
			}
		else
		{
			System.out.println("If loop failed");
		}
		
		//driver.findElement(By)
		driver.close();

	}

}
