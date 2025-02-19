package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementRadioPage {
	
	
	
	
	public WebDriver ldriver;
	
	public ElementRadioPage(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver, this);
		
	
	}
	
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[3]")
	@CacheLookup
	WebElement radiooption;
	
	@FindBy(xpath="//div[@class='mb-3' and text()='Do you like the site?']")
	@CacheLookup
	WebElement textmsg;
	
	@FindBy(xpath="//input[@id='yesRadio']")
	@CacheLookup
	WebElement yesradio;
	
	@FindBy(xpath="//input[@id='impressiveRadio']")
	@CacheLookup
	WebElement impressiveradio;
	
	@FindBy(xpath="//input[@id='noRadio']")
	@CacheLookup
	WebElement noradio;
	
	@FindBy(xpath="//p[@class='mt-3']")
	@CacheLookup
	WebElement textmsgbelow;
	
	@FindBy(xpath="//label[@for='yesRadio']")
	@CacheLookup
	WebElement yesid;
	
	@FindBy(xpath="//label[@for='impressiveRadio']")
	@CacheLookup
	WebElement impressiveid;
	
	
	@FindBy(xpath="//label[@for='noRadio']")
	@CacheLookup
	WebElement noid;
	
	
	public void clickonradiooption() {
		radiooption.click();
	}
	
	
	public String verifytextmsgabove() {
		String text=textmsg.getText();
		return text;
		
	}
	
	public String[] verifyallthereadiobuttonsdisplayed() {
	          boolean yes=yesid.isDisplayed();
	          boolean impressive=impressiveid.isDisplayed();
	          boolean no=noid.isDisplayed();
	          
	          String [] str= new String[3];
	          str[0]=String.valueOf(yes);
	          str[1]=String.valueOf(impressive);
	          str[2]=String.valueOf(no);
	          
	          for(int i=0; i<str.length; i++) {
	        	  System.out.println(str[i]);
	        	
	          }
	          
	          return str;
	}
	
	
	
	
	public String[] verifyyesandimpressiveenables() {
		boolean yes=yesradio.isEnabled();
		boolean impressive=impressiveradio.isEnabled();
		
		
		  String [] str= new String[2];
          str[0]=String.valueOf(yes);
          str[1]=String.valueOf(impressive);
          
          
          for(int i=0; i<str.length; i++) {
        	  System.out.println(str[i]);
        	
          }
          
          return str;
}
	
	
	public boolean verifynoradioisdisabled() {
		boolean no=noradio.isEnabled();
		return no;
	}
	
	
	
	
	public String clickyesandvarifytextmsg() throws InterruptedException {
		Thread.sleep(2000);
		boolean yes1=yesid.isDisplayed();
		System.out.println(yes1);
		yesid.click();
		boolean yes=yesradio.isSelected();
		System.out.println(yes);
		String str="";
		if(yes=true) {
			str=textmsgbelow.getText();
		}
		
		
		return str;
	}
	
	
	public String clickimpressiveandvarifytextmsg() {
		impressiveid.click();
		boolean yes=impressiveradio.isSelected();
		System.out.println(yes);
		String str="";
		if(yes=true) {
			str=textmsgbelow.getText();
		}
		
		
		return str;
	}
	
	

}


