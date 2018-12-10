package com.casestudy.edurekha;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launchbrowser {
	
	public static WebDriver driver=null;
	
	
	
	public void invoke() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragha\\Myselenium-workspace\\Edurekaselenium\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		
		driver.get("https://www.goindigo.in");
		
	
		WebElement tr = driver.findElement(By.name("or-src"));
		tr.click();
		tr.sendKeys("BLR");
		tr.sendKeys(Keys.ENTER);				
		
		
		WebElement tr2=driver.findElement(By.name("or-dest"));
		tr2.click();
		tr2.sendKeys("Lucknow");
		tr2.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
	WebElement tr3=	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']"));
	tr3.click();
	tr3.sendKeys(Keys.ENTER);
	
		
		driver.findElement(By.xpath("//label[contains(text(),'Passenger(s)')]")).click();
		//driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//li[@class='adult-pax-list']//span[@class='icon-plus']")).click();
		
		
		
		
	//driver.findElement(By.xpath("//span[@class='hp-src-btn']")).click();
		
		
				 
	
	
	
	}

	}

