package Sample1;

import org.openqa.selenium.WebDriver;

import Sample.POM;
import Sample2.LibGlobal;

public class StepDef extends LibGlobal {
	
	public static void main(String[] args) {
		POM pom = new POM();
		driver = launchBrowse();
		launchURL("https://www.google.com/");
		txtBoxWrite(pom.getGoogleSearch(), "HDFC login");
	}

}
