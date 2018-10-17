package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbLogout {

	private WebElement logoutbtn;
	public FbLogout(WebDriver driver)
	{
		logoutbtn=driver.findElement(By.xpath("//span[text()='Log Out']"));
	}
	public void clickLogout(){
		logoutbtn.click();
	}
}
