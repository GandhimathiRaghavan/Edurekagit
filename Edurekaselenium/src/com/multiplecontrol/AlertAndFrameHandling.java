package com.multiplecontrol;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class AlertAndFrameHandling {
	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragha\\Myselenium-workspace\\Edurekaselenium\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		driver.switchTo().frame("iframeResult");

		// To come out of a frame
		// driver.switchTo().defaultContent();

		driver.findElement(By.tagName("button")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		Thread.sleep(3000);
		alert.accept();

	}

}
