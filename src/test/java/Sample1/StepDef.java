package Sample1;

import Sample.POM;
import Sample2.LibGlobal;

public class StepDef extends LibGlobal {
	
	public static void main(String[] args) {
		
		LibGlobal l = new LibGlobal();
		l.launchBrowse();
		l.launchURL("https://www.google.com/");
		l.txtBoxWrite(POM.getGoogleSearch(), "HDFC login");
	}

}
