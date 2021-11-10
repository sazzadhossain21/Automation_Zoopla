package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");
		driver.findElement(By.xpath("(//*[contains(text(),'Sign in')])[2]")).click();
		driver.findElement(By.id("input-email-address")).sendKeys("hossain.smarttech2020@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("sazzad2020");
		driver.findElement(By.xpath("(//*[contains(text(),'Sign in')])[7]")).click();
		
		
	}

	}


