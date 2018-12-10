package com.multiplecontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Windowhandling {
	public static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragha\\Myselenium-workspace\\Edurekaselenium\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Session Id : "+parentWindow);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.tagName("button")).click();
		
		//Closing Child window
		
		String childWindow;
		childWindow =	driver.getWindowHandles().toArray()[1].toString();
		
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());

	}

}
