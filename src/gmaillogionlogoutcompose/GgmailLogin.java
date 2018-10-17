package gmaillogionlogoutcompose;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GgmailLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pankajkrchsia@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vishalkr@119");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
				
//		driver.findElement(By.xpath("//div[contains(@class, 'bBe')]")).click();
		driver.findElement(By.className("bBe")).click();
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		
//		WebElement to = driver.findElement(By.xpath("//div[contains(@class, 'wO nr ')]"));
//		Actions actions=new Actions(driver);
//		actions.moveToElement(to);
//		actions.sendKeys("pankajcs119@gmail.com").perform();
//		
//		WebElement sub = driver.findElement(By.xpath("//div[contains(@class, 'aoD az6')]"));
//		Actions subject=new Actions(driver);
//		subject.moveToElement(sub);
//		subject.sendKeys("application for leave");
//		driver.close();
	}
}