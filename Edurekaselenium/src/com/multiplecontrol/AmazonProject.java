package com.multiplecontrol;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonProject {
	public static WebDriver driver=null;
	
	
	List<WebElement> allLink;

	public void invokeBrowser(String browserType) {

		if (browserType.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ragha\\Myselenium-workspace\\Edurekaselenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserType.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver","C:\\Users\\Ragha\\git\\repository\\Edurekaselenium\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} 

		Dimension dim = new Dimension(768, 1024);

		driver.manage().window().setSize(dim);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

	}

	public String getTextFromLink() {
		String url = driver.findElement(By.linkText("Your Amazon.in")).getAttribute("href");

		return url;
	}

	public int getCountOfLinks() {

		allLink = driver.findElements(By.tagName("a"));

		return allLink.size();
	}

	public void printAllLinks() {

		for (WebElement link : allLink) {
			System.out.println("Link Text : " + link.getText() 
			+ " and Url : " + link.getAttribute("href"));
		}

}
}
