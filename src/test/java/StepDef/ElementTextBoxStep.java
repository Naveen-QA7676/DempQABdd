package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Pages.EelementTextBoxPage;
import Runner.DriverFactory;
public class ElementTextBoxStep {
	
	EelementTextBoxPage textoption=new EelementTextBoxPage(DriverFactory.getdriver());
	
	@Given("open the url")
	public void open_the_url() {
	DriverFactory.getdriver().get("https://demoqa.com/");
	  
	}

	@When("click on the elements tab")
	public void click_on_the_elements_tab() throws InterruptedException {
		Thread.sleep(10000);
	 textoption.Element();
	}

	@Then("fetch all the option in the elements tab")
	public void fetch_all_the_option_in_the_elements_tab() throws InterruptedException {
		Thread.sleep(2000);
		
	   List<WebElement> list= textoption.listofOptions();
	   for(WebElement ele:list) {
		  System.out.println(ele.getText()); 
	   }
	   
	}

	@Then("click on the text box option")
	public void click_on_the_text_box_option() throws InterruptedException {
		Thread.sleep(2000);
	   textoption.clicktextboxoption();
	}

	@Then("Display the all the text box available in the text box page")
	public void display_the_all_the_text_box_available_in_the_text_box_page() throws InterruptedException {
		Thread.sleep(2000);
		textoption.get_all_the_element_labels();
		textoption.get_all_the_elemetn_placeholder();
	}

	@Then("enter the all the fields {string} {string} {string} {string}")
	public void enter_the_all_the_fields(String string, String string2, String string3, String string4) throws InterruptedException {
		Thread.sleep(2000);
	     textoption.enterdetails(string, string2, string3, string4);
	     textoption.submit();
	}

	@Then("verify all the details {string} {string} {string} {string}")
	public void verify_all_the_details(String string, String string2, String string3, String string4) {
		ArrayList<String> list= textoption.printresult();
		String [] str=new String[4];
		str[0]=string;
		str[1]=string2;
		str[2]=string3;
		str[3]=string4;
		
		for(String ele:list) {
			for(int i=0;i<4;i++) {
				if(ele.equals(str[i])) {
					Assert.assertTrue(true);
				}
			}
			
		
	}
	
				
		
		
		
	   
	}


	
	
	
	
	
	
	
	
	
	

}
