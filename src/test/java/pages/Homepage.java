package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	 WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	
	
	@FindBy(xpath = "//textarea[@name='q']")
	WebElement searchbox;
	
	
	public void entersearch() {
		searchbox.sendKeys("Bangladeshi halal food");
		
	}
	
	
	public void entersearch1() {
		searchbox.sendKeys("Home depot");
		
	}
	
	
	@FindBy(xpath = "//input[@role='button']")
	WebElement clickbutton;
	
	public void checkbox() {
		clickbutton.click();
	}
	
	@FindBy(xpath = "//div[@id='result-stats']")
	WebElement searchresult;
	
	public void result() {
		String resultdisplay = searchresult.getText();
		System.out.println("*******************");
		System.out.println(resultdisplay);
		System.out.println("********************");
		
	}
	
}
