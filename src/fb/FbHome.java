package fb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbHome {

	private WebElement btn;
	
	
	public FbHome(WebDriver driver)
	{
		btn=driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
	}
	public void clickBtn(){
		btn.click();
	}
}
