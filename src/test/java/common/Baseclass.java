package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public WebDriver driver;
	
	public void launchbrowser() {
		
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
		
	}
	
	public void closebrowser() {
		driver.close();
	}
		
	
	
	
}
