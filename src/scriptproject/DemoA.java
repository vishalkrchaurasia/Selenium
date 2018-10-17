package scriptproject;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.DashboardPage;
import page.LoginPage;

	public class DemoA extends BaseTest{
		@Test
		public void testA(){
			
			//take the input data from excel file
			String un=Utility.getXLData(DATA_PATH, "Sheet1", 1, 0);
			String pw=Utility.getXLData(DATA_PATH, "Sheet1", 1, 1);
			
			//enter valid user name, password click login
			LoginPage l=new LoginPage(driver);
			l.setUserName(un);
			l.setPassword(pw);
			l.clickLogin();
			//verify that dashboard page is displayed
			
			
			//click welcome-logout
			DashboardPage d=new DashboardPage(driver);
			d.clickWelcome();
			d.clickLogout(10);
			//verify that login page is displayed
//			l.setUserName("admin");
//			l.setPassword("admin123");
//			l.clickLogin();
			Reporter.log("Executing testA",true);
//			Assert.fail();
		}
	}
