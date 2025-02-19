package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Runner.DriverFactory;

public class ElelementWebElementPage {
	
	
	
	public WebDriver ldriver;
	
	public ElelementWebElementPage(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[4]")
	@CacheLookup
	WebElement WebTable;
	
	
	@FindBy(id="addNewRecordButton")
	@CacheLookup
	WebElement addnewrecordbutton;
	
	@FindBy(id="userForm")
	@CacheLookup
	List<WebElement> intputfields;
	
	
	@FindBy(xpath="//input[@id='firstName']")
	@CacheLookup
	WebElement Firstnameinput;
	
	
	@FindBy(xpath="//input[@id='lastName']")
	@CacheLookup
	WebElement Lastnameinput;
	
	
	@FindBy(xpath="//input[@id='userEmail']")
	@CacheLookup
	WebElement Emailinput;
	
	@FindBy(xpath="//input[@id='age']")
	@CacheLookup
	WebElement Ageinput;
	
	@FindBy(xpath="//input[@id='salary']")
	@CacheLookup
	WebElement Salaryinput;
	

	@FindBy(xpath="//input[@id='department']")
	@CacheLookup
	WebElement Departmentinput;
	
	
	@FindBy(xpath="//label[text()='First Name']")
	@CacheLookup
	WebElement Firstnamelabel;
	
	
	@FindBy(xpath="//label[text()='Last Name']")
	@CacheLookup
	WebElement Lastnamelabel;
	
	
	@FindBy(xpath="//label[text()='Email']")
	@CacheLookup
	WebElement Emaillabel;
	
	@FindBy(xpath="//label[text()='Age']")
	@CacheLookup
	WebElement Agelabel;
	
	@FindBy(xpath="//label[text()='Salary']")
	@CacheLookup
	WebElement Salarylabel;
	
	@FindBy(xpath="//label[text()='First Name']")
	@CacheLookup
	WebElement firstnamelabel;
	
	@FindBy(xpath="//label[text()='Department']")
	@CacheLookup
	WebElement Departmentlabel;
	
	
	
	@FindBy(id="submit")
	@CacheLookup
	WebElement submit;
	
	
	/////////////////////////WebTable details//////////////////////////
	
	@FindBy(xpath="//div[@class='rt-thead -header']")
	@CacheLookup
	WebElement headers;
	
	
	
	///////////////////////////////////////////////////////////////////////
	
	@FindBy(xpath="//input[@id='searchBox']")
	@CacheLookup
	WebElement serachtext;
	
	
	
	
	public void clickonWebTable() {
		WebTable.click();
	}
	
	
	public void clickonAddRecord() {
		
		boolean add=addnewrecordbutton.isDisplayed();
		if(add==true) {
			addnewrecordbutton.click();
		}
		
	}
	
	public List<WebElement> getinoputfields() {
		return intputfields;
	}
	
	public String[] verifylabels() {
		String [] str= new String[6];
		str[0]=Firstnamelabel.getText();
		str[1]=Lastnamelabel.getText();
		str[2]=Emaillabel.getText();
		str[3]=Agelabel.getText();
		str[4]=Salarylabel.getText();
		str[5]=Departmentlabel.getText();
		
		return str;
		
		
	}
	
	public void enterinputs(String str1, String str2, String str3, String str4, String str5, String str6) {
		Firstnameinput.sendKeys(str1);
		Lastnameinput.sendKeys(str2);
		Emailinput.sendKeys(str3);
		
		Ageinput.sendKeys(str4);
		Salaryinput.sendKeys(str5);
		Departmentinput.sendKeys(str6);
		
	}
	
	public void clicksubmit() {
		submit.click();
	}
	
	public WebElement getheaders() {
		return headers;
	}
	
	public String[] getdata(String firstname) {
		
		String [] string=new String[6];
		for(int i=1;i<=6;i++) {
			
			String path="//div[@class='rt-tbody']/div["+ i+"]/div/div[1]";
			System.out.println(path);
			String name=DriverFactory.getdriver().findElement(By.xpath(path)).getText();
			if(name.equals(firstname)) {
				int a=0;
				for(int j=1; j<7; j++) {
					String path2="//div[@class='rt-tbody']/div["+i+"]/div/div["+j+"]";
					
					
					string[a]= DriverFactory.getdriver().findElement(By.xpath(path2)).getText();
					System.out.println(string[a]);
                    a++;
					
				}
				break;
			}
	}
		
		return string;
	}
	
	public void searchwithname(String name) {
		serachtext.sendKeys(name);
	}
	
public String[] getdata() {
		
		String [] string=new String[6];
		
			
			String path="//div[@class='rt-tbody']/div[1]/div/div[1]";
			System.out.println(path);
			String name=DriverFactory.getdriver().findElement(By.xpath(path)).getText();
		
				int a=0;
				for(int j=1; j<7; j++) {
					String path2="//div[@class='rt-tbody']/div[1]/div/div["+j+"]";
					
					
					string[a]= DriverFactory.getdriver().findElement(By.xpath(path2)).getText();
					System.out.println(string[a]);
                    a++;
					
				}
				return string;
			}
	


public String [] getelementerrormsg() {
	JavascriptExecutor js=(JavascriptExecutor)DriverFactory.getdriver();
	String validationMessage = (String) js.executeScript("return arguments[0].validationMessage;", Firstnameinput );
	String validationMessage1 = (String) js.executeScript("return arguments[0].validationMessage;", Lastnameinput );
	String validationMessage2 = (String) js.executeScript("return arguments[0].validationMessage;", Emailinput );
	String validationMessage3 = (String) js.executeScript("return arguments[0].validationMessage;", Ageinput );
	String validationMessage4 = (String) js.executeScript("return arguments[0].validationMessage;", Salaryinput );
	String validationMessage5 = (String) js.executeScript("return arguments[0].validationMessage;", Departmentinput );
	String [] str=new String[6];
	str[0]=validationMessage;
	System.out.println(validationMessage);
	str[1]=validationMessage1;
	System.out.println(validationMessage1);
	str[2]=validationMessage2;
	System.out.println(validationMessage2);
	str[3]=validationMessage3;
	System.out.println(validationMessage3);
	str[4]=validationMessage4;
	System.out.println(validationMessage4);
	str[5]=validationMessage5;
	System.out.println(validationMessage5);
	
	return str;
}




public String [] getelementerrormsgformat() {
	JavascriptExecutor js=(JavascriptExecutor)DriverFactory.getdriver();
	
	String validationMessage2 = (String) js.executeScript("return arguments[0].validationMessage;", Emailinput );
	String validationMessage3 = (String) js.executeScript("return arguments[0].validationMessage;", Ageinput );
	String validationMessage4 = (String) js.executeScript("return arguments[0].validationMessage;", Salaryinput );
	
	String [] str=new String[3];

	str[0]=validationMessage2;
	System.out.println(validationMessage2);
	str[1]=validationMessage3;
	System.out.println(validationMessage3);
	str[2]=validationMessage4;
	System.out.println(validationMessage4);
	
	
	return str;
}

















		
		
	}
	
	
	
	

