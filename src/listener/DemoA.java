package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Result.class)                 //package generics1 and listener are related.
public class DemoA {

	@Test
	public void createCustomer()
	{
		Reporter.log("create a customer",true);
		Assert.fail();
	}
	
	@Test
	public void deleteCustomer(){
	Reporter.log("Delete a c=Customer",true);
	}
}