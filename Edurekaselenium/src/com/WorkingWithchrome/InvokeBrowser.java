package com.WorkingWithchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	
		
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		
		public void invoke()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragha\\Myselenium-workspace\\Edurekaselenium\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://qctechhub.com");
			
		}
public void gettitle() {
	
	System.out.println(driver.getTitle());
}
		
		public void closebrowser() {
			driver.close();
		}
	

}
