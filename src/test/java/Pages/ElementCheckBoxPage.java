package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementCheckBoxPage {
	
	
	
	
	public WebDriver ldriver;
	
	public ElementCheckBoxPage(WebDriver driver) {
		ldriver=driver;
	   PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[2]")
	@CacheLookup
	WebElement checkbox;
	
	
	@FindBy(xpath="//span[@class='rct-text']/label/span[1]")
	@CacheLookup
	WebElement homecheckbox;
	
	
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/span/button")
	@CacheLookup
	WebElement arrowbutton;
	
	
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]")
	                 
	@CacheLookup
	WebElement Desktopcheckbox;
	
	
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label")
	@CacheLookup
	WebElement Desktopcheck;
	
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]")                 
	@CacheLookup
	WebElement Downloadscheckbox;
	
	@FindBy(css="#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg > path")                 
	@CacheLookup
	WebElement Downloadscheck;
	
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]")
	@CacheLookup
	WebElement Documentcheckbox;
	
	@FindBy(xpath="(//*[local-name()='svg' and @class='rct-icon rct-icon-check'])[4]")
	@CacheLookup
	WebElement Documentcheck;
	
	@FindBy(id="result")
	@CacheLookup
	WebElement result;
	
	@FindBy(xpath="//*[local-name()='svg' and @class='rct-icon rct-icon-half-check']")
	@CacheLookup
	WebElement homecheckboxHalfSelect;
	
	
	
	public void clickcheckboxoption() {
		checkbox.click();
	}
	
	
	public boolean verifyhomecheckboxunselected() {
	
		boolean selected=homecheckbox.isSelected();
	
		return selected;
	}
	
	public String[] verifyallcheckboxunselected() {
		arrowbutton.click();
		boolean desktopcheckbox=Desktopcheckbox.isSelected();
		System.out.println(desktopcheckbox);
		boolean downloadcheckbox=Downloadscheckbox.isSelected();
		System.out.println(downloadcheckbox);
		boolean documentcheckbox=Documentcheckbox.isSelected();
		System.out.println(documentcheckbox);
		
		String [] str= new String[3];
		str[0]=String.valueOf(desktopcheckbox);
		System.out.println(str[0]);
		str[1]=String.valueOf(downloadcheckbox);
		System.out.println(str[1]);
		str[2]=String.valueOf(documentcheckbox);
		System.out.println(str[2]);
		
		for(int a=0; a<str.length; a++) {
			System.out.println(str[a]);
		}
		return str;
		}
	
	
	
	public String[] verifyallcheckboxselected() {
		
		boolean desktopcheck=Desktopcheck.isSelected();
		System.out.println(desktopcheck);
		boolean downloadcheck=Downloadscheck.isSelected();
		System.out.println(downloadcheck);
		boolean documentcheck=Documentcheck.isSelected();
		System.out.println(documentcheck);
		
		String [] str= new String[3];
		str[0]=String.valueOf(desktopcheck);
		System.out.println(str[0]);
		str[1]=String.valueOf(downloadcheck);
		System.out.println(str[1]);
		str[2]=String.valueOf(documentcheck);
		System.out.println(str[2]);
		
		for(int a=0; a<str.length; a++) {
			System.out.println(str[a]);
		}
		return str;
	}
	
	public String verifyresult() {
		return result.getText();
	}
	
	public void clickparentcheckbox() {
		homecheckbox.click();
		System.out.println(homecheckbox.isSelected());
	}
	
	
	
	
}









