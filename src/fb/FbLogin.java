package fb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbLogin {
	//declaration
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;

	//initialization
	public FbLogin(WebDriver driver)
	{
		unTB=driver.findElement(By.id("email"));
		pwTB=driver.findElement(By.id("pass"));
		loginBTN=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		System.out.println(driver.getTitle());
	}
	//utilization
	public void setUsername(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	public void clickLogin(){
		loginBTN.click();
	}
}