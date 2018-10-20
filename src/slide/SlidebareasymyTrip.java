package slide;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SlidebareasymyTrip {
	static {
		System.setProperty("driver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://www.easemytrip.com/?");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("FromSector_show")).sendKeys("bang");
		driver.findElement(By.xpath("//span[contains(text(),'BLR')]")).click();
		driver.findElement(By.id("Editbox13_show")).sendKeys("goa");
		driver.findElement(By.xpath("//span[contains(text(),'GOI')]")).click();
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.className("active-date")).click();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		WebElement lp = driver.findElement(By.xpath("//span[contains(@class,'ui-slider')] "));
		
		Thread.sleep(6000);
		Actions actions=new Actions(driver);
		actions.clickAndHold(lp).moveByOffset(30,0).release().perform();
	}
}