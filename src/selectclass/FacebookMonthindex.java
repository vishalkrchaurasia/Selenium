package selectclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookMonthindex {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement listbox = driver.findElement(By.id("month"));
		Select select=new Select(listbox);
		select.selectByValue("11");
		//select.selectByIndex(3);
		//select.selectByVisibleText("May");
		
		List<WebElement> allOptions = select.getOptions();
		List<String> allText = new ArrayList<String>();
		
		for(WebElement option:allOptions)
		{
			allText.add(option.getText());
		}
		Collections.sort(allText);
		for(String text:allText)
		{
			System.out.println(text);
		}
	}
}
