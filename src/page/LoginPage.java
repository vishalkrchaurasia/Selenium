package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	//declaration
	@FindBy(id="txtUsername")
	private WebElement unTB;

	@FindBy(id="txtPassword")
	private WebElement pwTB;

	@FindBy(id="btnLogin")
	private WebElement loginBTN;

	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void setUserName(String un){
		unTB.sendKeys(un);
	}

	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}

	public void clickLogin(){
		loginBTN.click();
	}
}