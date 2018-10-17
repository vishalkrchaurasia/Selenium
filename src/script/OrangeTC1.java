package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import generic.WebGeneric;
import page.DashboardPage;
import page.LoginPage;

public class OrangeTC1 extends BaseTest {

	@Test(priority=1,groups= {"smoke"})
	public void testA() {
		//take the input data from excel file
		String un = Utility.getXLData(DATA_PATH, "OrangeTC1", 1, 0);
		String pw = Utility.getXLData(DATA_PATH, "OrangeTC1", 1, 1);
		String homePageURL = Utility.getXLData(DATA_PATH, "OrangeTC1", 1, 2);
		String loginPageURL = Utility.getXLData(DATA_PATH, "OrangeTC1", 1, 3);
		//Enter Valid user name password click login
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		//verify that dashboard page is displayed
		WebGeneric.verifyURL(driver, lngETO, homePageURL);
		//click welcome \ logout
		DashboardPage d=new DashboardPage(driver);
		d.clickWelcome();
		d.clickLogout(lngETO);
		//verify that login page is displayed
		WebGeneric.verifyURL(driver, lngETO, loginPageURL);
	}
}