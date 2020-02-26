package Sample1;

import org.openqa.selenium.WebDriver;

import Sample.POM;
import Sample2.LibGlobal;

public class StepDef extends LibGlobal {
	static POM pom;
	static WebDriver driver;
	public static void main(String[] args) {
		driver = launchBrowse();
		launchURL("https://www.google.com/");
		txtBoxWrite(pom.getSearchBox(), "HDFC login");
	}

}
