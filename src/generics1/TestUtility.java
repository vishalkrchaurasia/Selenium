package generics1;

import org.testng.Reporter;

public class TestUtility {

	public static void main(String[] args) {

		Utility.writeResultToXL("./result/Summary.xlsx", 3, 2,4);
		Reporter.log("t",true);
	}

}
