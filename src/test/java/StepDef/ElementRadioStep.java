package StepDef;

import org.junit.Assert;

import Pages.ElementRadioPage;
import Runner.DriverFactory;
import io.cucumber.java.en.Then;

public class ElementRadioStep {
	
	
	
	
	ElementRadioPage element=new ElementRadioPage(DriverFactory.getdriver());
	
	
	
	
	@Then("click on the radio option")
	public void click_on_the_radio_option() throws InterruptedException {
		Thread.sleep(2000);
		element.clickonradiooption();
		System.out.println("radio option is clicked");
	
	}

	@Then("varify the text displayed")
	public void varify_the_text_displayed() throws InterruptedException {
		Thread.sleep(2000);
	String str=	element.verifytextmsgabove();
	System.out.println(str);
	if(str.equals("Do you like the site?")) {
		Assert.assertTrue(true);
	}
	}

	@Then("varify the yes, impressive and no radio buttons are displayed")
	public void varify_the_yes_impressive_and_no_radio_buttons_are_displayed() throws InterruptedException {
		Thread.sleep(2000);
		String [] str=element.verifyallthereadiobuttonsdisplayed();
		int a =0;
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
			if(str[i].equals("true")) {
				a++;
			}
		}
		if(a==3) {
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
		
	}

	@Then("varify yes and impressive radio buttons are enabled for check or uncheck")
	public void varify_yes_and_impressive_radio_buttons_are_enabled_for_check_or_uncheck() throws InterruptedException {
	   
		Thread.sleep(2000);
		
		String [] str=element.verifyyesandimpressiveenables();
		int a =0;
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
			if(str[i].equals("true")) {
				a++;
			}
		}
		if(a==2) {
			Assert.assertTrue(true);
		}
		
	}

	@Then("varify the no radio button is disabled")
	public void varify_the_no_radio_button_is_disabled() throws InterruptedException {
		Thread.sleep(2000);
	  boolean no= element.verifynoradioisdisabled();
	 
	  if(no==false) {
		  Assert.assertTrue(true);
		  System.out.println("true");
	  }else {
		  Assert.assertTrue(false);
	  }
	}

	@Then("click the yes button and varify the text msg")
	public void click_the_yes_button_and_varify_the_text_msg() throws InterruptedException {
		Thread.sleep(2000);
	   String str=element.clickyesandvarifytextmsg();
	   System.out.println(str);
	   if(str.equals("You have selected Yes")) {
		   Assert.assertTrue(true);
	   }else {
		   Assert.assertTrue(true);
	   }
	}

	@Then("click the impessive radio button and varify the text msg")
	public void click_the_impessive_radio_button_and_varify_the_text_msg() throws InterruptedException {
		Thread.sleep(2000);
		 String str=element.clickimpressiveandvarifytextmsg();
		 System.out.println(str);
		   if(str.equals("You have selected Impressive")) {
			   Assert.assertTrue(true);
		   }else {
			   Assert.assertTrue(true);
		   }
	}

	
	
	

}
