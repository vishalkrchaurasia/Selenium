package qSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	//initialization
	public LoginPage(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.xpath("//div[.='Login ']"));
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