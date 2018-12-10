package Demo.multiplebrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplebrowser {
	
public static WebDriver driver=null;
	
	
	
	public void invoke(String browsertype) throws InterruptedException
	{
		
		if(browsertype.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragha\\Myselenium-workspace\\Edurekaselenium\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		
		driver.get("https://www.goindigo.in");
		
	}else if(browsertype.equals("firefox"))
	{
		
		if(browsertype.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ragha\\git\\repository\\Edurekaselenium\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
			
			driver.get("https://www.facebook.com");
		
	}

}
}
	public void gettitle() {
		
		System.out.println(driver.getTitle());
	}



	
}