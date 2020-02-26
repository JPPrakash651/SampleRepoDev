package Sample1;

import Sample2.LibGlobal;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class StepDef extends LibGlobal {
	public static void main(String[] args) {
//		launchBrowse();
		launchURL("https://www.google.com/");
		txtBoxWrite(getSearchBox(), "HDFC login");
	}

}
