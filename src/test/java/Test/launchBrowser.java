package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\120190\\Documents\\Personal\\SW\\Sample Automation\\SampleRepoDev\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@title='Search']"));
		txtSearch.sendKeys("HDFC login netbanking");
		WebElement btnSearch = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		btnSearch.click();
		WebElement lnkSearchResult = driver.findElement(By.xpath("//h3[text()='Welcome to HDFC Bank NetBanking']"));
		lnkSearchResult.click(); 
		driver.switchTo().frame(0);
		WebElement txtUserName = driver.findElement(By.name("fldLoginUserId"));
		txtUserName.sendKeys("123456");
		WebElement btnContinue = driver.findElement(By.xpath("//img[@alt='continue']"));
		btnContinue.click();
		
		WebElement btnLogin = driver.findElement(By.xpath("//img[@alt='Login']"));
		btnLogin.click();
		
	}

}
