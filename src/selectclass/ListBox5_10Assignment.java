package selectclass;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox5_10Assignment {


	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/VISHAL/Desktop/Dishes.html");
		WebElement listbox = driver.findElement(By.id("SLV"));
		Select select=new Select(listbox);
		List<WebElement> allOptions = select.getOptions();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		for(WebElement option:allOptions)
		{
			String key = option.getText();
			if(map.containsKey(key))
			{
				Integer value=map.get(key);
				value++;
				map.put(key, value);
			}
			else
			{
				map.put(key, 1);
			}
		}
		//print options present in listbox with their occurence

		System.out.println(map);

		//Check given option is duplicate in listbox or not
		String s="Idly";
		if(map.get(s)>1){
			System.out.println(s+" is duplicatte");
		}
		else{
			System.out.println(s+" is not duplicatte");
		}
		//print all the options present in listbox without repeating the options		
		System.out.println(map.keySet());
		//print only unique options present in listbox		
		for(String key:map.keySet())
		{
			if(map.get(key)==1)
			{
				System.out.println(key);
			}
		}
		//print only duplicate options present in listbox
		for(String key:map.keySet())
		{
			if(map.get(key)>1)
			{
				System.out.println(key);
			}
		}
	}
}