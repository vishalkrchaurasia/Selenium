package fbloginbypom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbHome {

	@FindBy(xpath="//div[@id='userNavigationLabel']")
	private WebElement logoutdropdown;

	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logoutbtn;

	public FbHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickLogout(){
		logoutbtn.click();
	}

	public void clickBtnLogoutdropdown(){
		logoutdropdown.click();
	}
}