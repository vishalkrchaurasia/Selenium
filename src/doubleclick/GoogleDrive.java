package doubleclick;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleDrive {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/drive/");
		driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[4]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pankajkrchsia@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vishalkr@119");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement target = driver.findElement(By.xpath("//span[text()='Getting started']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(target).perform();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
}
}