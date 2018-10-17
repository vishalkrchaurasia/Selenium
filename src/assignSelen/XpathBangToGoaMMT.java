package assignSelen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBangToGoaMMT {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		//driver.findElement(By.className[contains(text(),'input')])
		//driver.findElement(By.xpath("(//span[text()='AirAsia'])[2]/../../../../div[6]")).click();;
		//driver.findElement(By.xpath("(//span[text()='AirAsia'])[2]/../../../../div[7]")).click();;
		
		driver.findElement(By.xpath("(//input[@id='hp-widget__sfrom'])")).clear();
		driver.findElement(By.xpath("(//input[@id='hp-widget__sfrom'])")).sendKeys("Goa");
		driver.findElement(By.xpath("(//input[contains(text(),'Goa, India']")).click();
		driver.findElement(By.xpath("(//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input'])[2]"));
	}

}
