package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZooplaSignin {
	static WebDriver driver;
public static void setup() {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.zoopla.co.uk/");
	
}
public static void teardown() {
	driver.quit();
}
}
