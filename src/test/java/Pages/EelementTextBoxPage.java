package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EelementTextBoxPage {
	
	public WebDriver ldriver;
	
	public EelementTextBoxPage(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")
	@CacheLookup
	WebElement element;
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li")
	@CacheLookup
	List<WebElement> list;
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[1]")
	@CacheLookup
	WebElement textbox;
	
	@FindBy(id="userName-label")
	@CacheLookup
	WebElement name;
	
	@FindBy(id="userName")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="userEmail-label")
	@CacheLookup
	WebElement mail;
	
	@FindBy(id="userEmail")
	@CacheLookup
	WebElement userEmail;
	
	
	@FindBy(id="currentAddress-label")
	@CacheLookup
	WebElement caddress;
	
	@FindBy(id="currentAddress")
	@CacheLookup
	WebElement currentAddress;
	
	@FindBy(id="permanentAddress-label")
	@CacheLookup
	WebElement paddress;
	
	@FindBy(id="permanentAddress")
	@CacheLookup
	WebElement permanentAddress;

	
	@FindBy(id="submit")
	@CacheLookup
	WebElement submit;
	
	@FindBy(xpath="//div[@class='border col-md-12 col-sm-12']")
	@CacheLookup
	WebElement result;
	
	@FindBy(xpath="//div[@class='border col-md-12 col-sm-12']/p[1]")
	@CacheLookup
	WebElement resultname;
	
	@FindBy(xpath="//div[@class='border col-md-12 col-sm-12']/p[2]")
	@CacheLookup
	WebElement resultemail;
	
	
	@FindBy(xpath="//div[@class='border col-md-12 col-sm-12']/p[3]")
	@CacheLookup
	WebElement resultcaddress;
	
	@FindBy(xpath="//div[@class='border col-md-12 col-sm-12']/p[4]")
	@CacheLookup
	WebElement resultpaddress;
	
	public void Element() {
		element.click();
	}
	
	public List<WebElement> listofOptions() {
		return list;
	}
	
	public void clicktextboxoption() {
		textbox.click();
	}
	
	public void get_all_the_element_labels() {
		System.out.println(name.getText());
		System.out.println(mail.getText());
		System.out.println(caddress.getText());
		System.out.println(paddress.getText());
	}

	public void get_all_the_elemetn_placeholder() {
		System.out.println(username.getAttribute("placeholder"));
		System.out.println(userEmail.getAttribute("placeholder"));
		System.out.println(currentAddress.getAttribute("placeholder"));
		System.out.println(permanentAddress.getAttribute("placeholder"));
		

	}
	
	
	public void enterdetails(String name, String mail, String Caddress, String paddress) {
		username.sendKeys(name);
		userEmail.sendKeys(mail);
		currentAddress.sendKeys(Caddress);
		permanentAddress.sendKeys(paddress);
	}
	
	public void submit() {
		submit.click();
	}
	
	public String getresult() {
		return result.getText();
	}
	
	public ArrayList printresult() {
		ArrayList<String> list = new ArrayList();

		list.add(resultname.getText());
		list.add(resultemail.getText());
		list.add(resultcaddress.getText());
		list.add(resultpaddress.getText());
		
		return list;
		
	}
	
	
}
