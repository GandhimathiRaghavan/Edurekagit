package com.multiplecontrol;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithControl {
	
	public static WebDriver driver=null;
	
	
	public void invoke()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragha\\Myselenium-workspace\\Edurekaselenium\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		
	
		
}
	
	public void mouseHover() {
		WebElement electroniclink=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(electroniclink).build().perform();
		
		WebElement samsunglink=driver.findElement(By.xpath("(//a[text()='Samsung'])[1]"));
		
		action.moveToElement(samsunglink).click().perform();
		System.out.println(driver.getTitle());
		
		
		
	}
}
