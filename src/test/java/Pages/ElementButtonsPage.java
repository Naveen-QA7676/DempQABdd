package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Runner.DriverFactory;

public class ElementButtonsPage {
	
	
	
	public WebDriver ldriver;
	
	public ElementButtonsPage(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}


	
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[5]")
	@CacheLookup
	WebElement button;
	
	@FindBy(id="doubleClickBtn")
	@CacheLookup
	WebElement doubleClickBtn;
	
	@FindBy(id="rightClickBtn")
	@CacheLookup
	WebElement rightClickBtn;
	
	@FindBy(xpath="//button[@type='button' and text()='Click Me']")
	@CacheLookup
	WebElement click;
	
	@FindBy(xpath="//p[@id='doubleClickMessage']")
	@CacheLookup
	WebElement doubleClickMessage;
	
	@FindBy(xpath="//p[@id='rightClickMessage']")
	@CacheLookup
	WebElement rightClickMessage;
	
	@FindBy(xpath="//p[@id='dynamicClickMessage']")
	@CacheLookup
	WebElement dynamicClickMessage;
	
	
	
	
	
	
	
	
	
	public void clickbuttons() {
		button.click();
	}
	
	public String[] verifybuttonsdisplayed() {
		
		String [] str=new String[3];
		
		if(doubleClickBtn.isDisplayed()&&doubleClickBtn.isEnabled()) {
			str[0]="true";
			System.out.println(str[0]);
		}
		else {
			str[0]="false";
			System.out.println(str[0]);
		}
		
		if(rightClickBtn.isDisplayed()&&rightClickBtn.isEnabled()) {
			str[1]="true";
			System.out.println(str[1]);
		}
		else {
			str[1]="false";
			System.out.println(str[1]);
		}
		
		if(click.isDisplayed()&&click.isEnabled()) {
			str[2]="true";
			System.out.println(str[2]);
		}
		else {
			str[2]="false";
			System.out.println(str[2]);
		}
		
		
		return str;
	}
	
	public String[] verifytextmsg() {
		
		Actions action = new Actions(DriverFactory.getdriver()) ;
		action.doubleClick(doubleClickBtn).build().perform();
		
		String [] str=new String [3];
		
		str[0]=	doubleClickMessage.getText();
		System.out.println(str[0]);
		
		
		action.contextClick(rightClickBtn).build().perform();
		str[1]=	rightClickMessage.getText();
		System.out.println(str[1]);
		
		click.click();
		str[2]=	dynamicClickMessage.getText();
		System.out.println(str[2]);
		
		
		return str;
		
	}
	
	
	
	
	
	
	
	
}
