package Sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal  {
	public static WebDriver driver;

	public static WebDriver launchBrowse() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Project\\SampleProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void launchURL(String s) {
		
		driver.get(s);
	}
	public static void txtBoxWrite(WebElement e, String a1) {
		e.sendKeys(a1);
		
	}	

}
