package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAct {

	//declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	//initialization
	 public LoginAct(WebDriver driver) {
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
