package slide;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Slide {
	static {
		System.setProperty("driver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://www.cleartrip.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("FromTag")).sendKeys("bang");
		driver.findElement(By.xpath("//a[contains(text(),'BLR')]")).click();
		driver.findElement(By.id("ToTag")).sendKeys("goa");
		driver.findElement(By.xpath("//a[contains(text(),'GOI')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		driver.findElement(By.id("SearchBtn")).click();

		WebElement slider = driver.findElement(By.className("rangeHandle"));
		int x = slider.getSize().getWidth();
		Thread.sleep(6000);
		Actions actions=new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(x-150, 0).release().perform();
	}
}