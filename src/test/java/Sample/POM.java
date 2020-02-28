package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sample2.LibGlobal;

public class POM extends LibGlobal {
	WebDriver driver;
	public POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='gLFyf gsfi']")
	private static WebElement GoogleSearch;

	public static WebElement getGoogleSearch() {
		return GoogleSearch;
	}
}
