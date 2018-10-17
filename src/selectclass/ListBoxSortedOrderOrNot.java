package selectclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSortedOrderOrNot {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement listbox = driver.findElement(By.id("month"));
		Select select=new Select(listbox);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText1 = new ArrayList<String>();
		for(WebElement option:allOptions)
		{
			allText1.add(option.getText());
		}
		
		List<String> allText2 = new ArrayList<String>(allText1);
		Collections.sort(allText2);
		System.out.println(allText1);
		System.out.println(allText2);
		
		if(allText1.equals(allText2))
		{
			System.out.println("ListBox content is in sorted order");
		}
		else
		{
			System.out.println("ListBox content is in not sorted order");
		}
	}
}