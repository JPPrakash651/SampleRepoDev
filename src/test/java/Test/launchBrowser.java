package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium Project\\SampleProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("HDFC login netbanking");
		WebElement btnSearch = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		btnSearch.click();
		WebElement lnkSearchResult = driver.findElement(By.xpath("//h3[text()='NetBanking - HDFC Bank']"));
		lnkSearchResult.click(); 
		driver.switchTo().frame("login_page");
		WebElement txtUserName = driver.findElement(By.name("fldLoginUserId"));
		txtUserName.sendKeys("123456");
		WebElement btnContinue = driver.findElement(By.xpath("//img[@alt='continue']"));
		btnContinue.click(); Thread.sleep(2000);
		WebElement txtPassword = driver.findElement(By.name("fldPassword"));
		txtPassword.sendKeys("123456");
		WebElement btnContinue1 = driver.findElement(By.xpath("//img[@alt='Login']"));
		btnContinue1.click();
		driver.close();
	}

}
