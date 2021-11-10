package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassPractice {
	public static void clickElementbyjs(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	WebElement element=driver.findElement(By.linkText("Best Sellers"));
	ClassPractice.clickElementbyjs(element, driver);
		
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");
	//driver.findElement(By.id("nav-search-submit-button")).click();
	//driver.findElement(By.xpath("//img[@alt='Amazon Fire TV Omni Series. Hands-free TV with Alexa.']")).click();
}


}
