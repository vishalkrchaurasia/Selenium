package fbloginbypom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin {
	//declaration
	@FindBy(id="email")
	private WebElement unTB;
	@FindBy(id="pass")
	private WebElement pwTB;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBTN;

	//initialization
	public FbLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);		
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