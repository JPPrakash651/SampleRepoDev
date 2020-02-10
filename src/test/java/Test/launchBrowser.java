package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium Project\\SampleProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@title='Search']"));
		txtSearch.sendKeys("HDFC login");
		WebElement btnSearch = driver.findElement(By.xpath("(//input[@data-ved='0ahUKEwjzv6Lx1sfnAhWr8HMBHe7rDo4Q4dUDCAo']"));
		btnSearch.click();
		
		WebElement lnkSearchResult = driver.findElement(By.xpath("//h3[text()='NetBanking - HDFC Bank']"));
		lnkSearchResult.click();
		
	}

}
