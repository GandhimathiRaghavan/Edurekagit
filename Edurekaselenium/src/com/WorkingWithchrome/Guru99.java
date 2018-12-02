package com.WorkingWithchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	WebDriver driver=null;
	
	
	public void invoke()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragha\\Myselenium-workspace\\Edurekaselenium\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4");
		
	}
public void gettitle() {

System.out.println(driver.getTitle());
}

 public void login(String usid,String password) {
	 
	 WebElement uid=driver.findElement(By.name("uid"));
	 uid.sendKeys(usid);
	 
	 driver.findElement(By.name("password")).sendKeys(password);
	 driver.findElement(By.name("btnLogin")).click();
	 
 }
 public void addCustumer() {
	 driver.findElement(By.partialLinkText("New Customer")).click();
	 driver.findElement(By.name("name")).sendKeys("gmathi");
	 driver.findElement(By.xpath("//input[@value='f']")).click();
	 driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("270 adresss steet");
	 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chandler");
	 driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Arizona");
	 driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("123456");
	 driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("12345678");
	 String emailID="aa"+System.currentTimeMillis()+"@gmail.com";
	 System.out.println("emailID  :"+emailID);
	 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(emailID);
	 
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
	 
	 driver.findElement(By.xpath("//input[@value='Submit']")).click();
	 
	 
	 

	 
	 
	 
	 
	 
	 
 }
	
	public void closebrowser() {
		driver.close();
	}


}


	

