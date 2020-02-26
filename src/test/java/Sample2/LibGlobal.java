package Sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal  {
	static WebDriver driver;

//	public static void launchBrowse() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\120190\\Documents\\Personal\\SW\\Sample Automation\\SampleRepoDev\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}

	public static void launchURL(String s) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\120190\\Documents\\Personal\\SW\\Sample Automation\\SampleRepoDev\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(s);
	}
	public static void txtBoxWrite(WebElement e, String a1) {
		e.sendKeys(a1);
		
	}	

}
