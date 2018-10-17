package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchPage{
	//declaration
	//@FindBy(xpath="//a")
	@FindBys(@FindBy(xpath="//a"))
	private List<WebElement> allLinks;
	
		//initialization
	public SearchPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//utilization
		
	public void printLinkcount(){
		int count=allLinks.size();
		System.out.println(count);
	}
	
	/*
	 * @FindBy(locator="value")
	 *private List<WebElement> listname;
	 
	 * */
	
}