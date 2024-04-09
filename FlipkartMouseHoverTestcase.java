package com.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseHoverTestcase {
	
	static WebDriver driver;
	public void FlipkartMouseHoverTestcase()
	{

		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		WebElement webele=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		Actions action=new Actions(driver);
		action.moveToElement(webele).perform();
		
		
		
		//FlipkartRepo fr=new FlipkartRepo(driver);
		//fr.mouse_hover_Electronis();
	}

	public static void main(String[] args) {

		FlipkartMouseHoverTestcase fho=new FlipkartMouseHoverTestcase();
		fho.FlipkartMouseHoverTestcase();
	}

}
