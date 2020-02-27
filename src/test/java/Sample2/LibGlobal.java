package Sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal  {
	public WebDriver driver;

	public WebDriver launchBrowse() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\120190\\Documents\\Personal\\SW\\Sample Automation\\SampleRepoDev\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void launchURL(String s) {
		driver.get(s);
	}
	public void txtBoxWrite(WebElement e, String a1) {
		e.sendKeys(a1);
		
	}	

}
